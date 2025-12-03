import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework9 {

    public static Map<String, String> loadUsers(String filename) {
        Map<String, String> userMap = new HashMap<>();

        try {
            File file = new File(filename);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] parts = line.split(",");

                if (parts.length == 2) {
                    userMap.put(parts[0].trim(), parts[1].trim());
                }
            }
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("오류: " + filename + " 파일을 찾을 수 없습니다. 프로그램이 종료됩니다.");
            return null;
        }

        return userMap;
    }

    public static void main(String[] args) {
        Map<String, String> userMap = loadUsers("db.txt");

        if (userMap == null) {
            return;
        }

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("id와 password를 입력해주세요.");

            System.out.print("id : ");
            String id = sc.nextLine().trim();

            if (!userMap.containsKey(id)){
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.print("password : ");
            String password = sc.nextLine().trim();

            if (!userMap.get(id).equals(password)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
        sc.close();
    }

}
