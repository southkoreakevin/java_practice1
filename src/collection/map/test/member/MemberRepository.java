package collection.map.test.member;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MemberRepository {

    private Map<String, Member> memberMap = new HashMap<>();

    public MemberRepository() {
    }

    public void save(Member member) {
        String id = member.getId();
        memberMap.put(id, member);
    }

    public void remove(String id) {
        if (memberMap.remove(id) == null) {
            System.out.println("맞는 키가 없습니다.");
        }

    }

    public Member findById(String id) {
        for (String string : memberMap.keySet()) {
            if (id.equals(string)) {
                return memberMap.get(id);
            }
        }
        return null;
    }

    public Member findByName(String name) {
        for (Entry<String, Member> stringMemberEntry : memberMap.entrySet()) {
            if (stringMemberEntry.getValue().getName().equals(name)) {
                return stringMemberEntry.getValue();
            }
        }
        return null;
    }
}
