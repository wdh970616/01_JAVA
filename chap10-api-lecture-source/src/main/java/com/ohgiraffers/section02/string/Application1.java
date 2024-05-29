package com.ohgiraffers.section02.string;

import com.sun.security.jgss.GSSUtil;

public class Application1 {
    public static void main(String[] args) {

        // String 클래스의 자주 사용하는 메소드 숙지

        /*
         * charAt() : 해당 문자열의 특정 인덱스에 해당하는 문자를 반환
         * 인덱스를 벗어나면 IndexOutOfBoundsException이 발생한다.
         */
        String str1 = "apple";
        for (int i = 0; i < str1.length(); i++) {
            System.out.println("'" + str1 + "'의 charAt(" + i + ") = " + str1.charAt(i));
        }
        System.out.println();

        /*
         * compareTo() : 인자로 전달된 문자열과 사전 순으로 비교하여
         * 두 문자열이 같다면 0을 반환하고 인자로 전달된 문자열보다 작으면 음수를, 크면 양수를 반환
         * 대소문자를 구분하여 비교함
         */
        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        // 같으면 0 반환
        System.out.println("str2.compareTo(str3) 같으면 반환값은 = " + str2.compareTo(str3));
        // 대문자와 소문자의 차이는 32
        System.out.println("str2.compareTo(str4) 대문자와 소문자의 차이는 = " + str2.compareTo(str4));
        System.out.println("str4.compareTo(str2) 반대로 하면 음수를 반환 = " + str4.compareTo(str2));
        // compareToIgnoreCase() : 대소문자 구분하지않고 비교
        System.out.println("str4.compareToIgnoreCase(str2) 사용시 대소문자 구분하지않음 = " + str4.compareToIgnoreCase(str2));
        System.out.println();

        /*
         * concat() : 문자열에 인자로 전달된 문자열을 합치기해서 새로운 문자열을 반환
         * 원본 문자열에는 영향을 주지 않는다.
         */
        System.out.println("str2와 str5에 concat() 사용 = " + (str2.concat(str5)));
        System.out.println("concat()이 원본에 영향을 주지는 않음 = " + str2);
        System.out.println();

        /*
         * indexOf() : 문자열에서 특정 문자를 탐색하여 처음 일치하는 인덱스 위치를 정수형으로 반환
         * 단, 일치하는 문자가 없을때는 -1을 반환한다.
         */
        String indexStr = "java oracle";
        System.out.println("indexOf('a') = java oracle에서 a의 인덱스 = " + indexStr.indexOf('a'));
        System.out.println("indexOf('z') 일치하는 문자가 없는경우엔? = " + indexStr.indexOf('z'));
        System.out.println();

        /*
         * trim() : 문자열의 앞 뒤 공백을 제거한 문자열을 반환한다.
         */
        String trimStr = "          java            ";
        System.out.println("trimStr = '" + trimStr + "'");
        System.out.println("trim()으로 공백 제거한 결과 = '" + trimStr.trim() + "'");
        System.out.println("trim()도 원본에는 영향 없음 = '" + trimStr + "'");
        System.out.println();

        /*
         * toLowerCase() : 모든 문자를 소문자로 변환시킴
         * toUpperCase() : 모든 문자를 대문자로 변환시킴.
         */
        String caseStr = "JavaOracle";
        System.out.println("toLowerCase() 사용 = " + caseStr.toLowerCase());
        System.out.println("toUpperCase() 사용 = " + caseStr.toUpperCase());
        System.out.println("둘다 원본에는 영향 없음 = " + caseStr);

        /*
         * substring() : 문자열의 일부분을 잘라내어 새로운 문자열을 반환
         * 원본에 영향 없음
         */
        String javaoracle = "javaoracle";
        System.out.println("substring(3, 6) = 인덱스 3부터 6까지 = " + javaoracle.substring(3, 6));
        System.out.println("substring(3) = 인덱스 3부터 끝까지 = " + javaoracle.substring(3));
        System.out.println("substring()도 원본에는 영향 없음 = " + javaoracle);

        /*
         * replace() : 문자열에서 대체할 문자열로 기존 문자열을 변경해서 반환
         * 원본에 영향 없음
         */
        System.out.println("javaoracle.replace(\"java\", \"python\") = \"java\"를 \"python\"로 수정하겠다 = " + javaoracle.replace("java", "python"));
        System.out.println("replace()도 원본에는 영향 없음 = " + javaoracle);
        System.out.println();

        /*
         * length() : 문자열의 길이를 정수형으로 반환
         * 길이가 0인 문자열은 null과는 다름에 주의
         */
        System.out.println("javaoracle.length() = " + javaoracle.length());
        System.out.println("빈 문자열에 length() 사용시 = " + "".length());
        System.out.println();

        /*
         * isEmpty() : 문자열의 길이가 0이면 true를 반환, 아니면 false를 반환
         * 길이가 0인 문자열은 null과 다름에 주의
         */
        System.out.println("빈 문자열에 isEmpty() 사용 = " + "".isEmpty());
        System.out.println("\"abc\"에 isEmpty() 사용 = " + "abc".isEmpty());
    }
}
