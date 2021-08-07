package day04;

import java.util.ArrayList;
import java.util.List;

public class MemberData {
	public List<Member> memberDatas = new ArrayList<Member>();
	Member memberData;
	
	public MemberData() {}
	
	public MemberData(Member memberData) {
		this.memberData = memberData;
	}

	public List<Member> getMemberDatas() {
		return memberDatas;
	}

	public void setMemberDatas(Member memberData) {
		this.memberData = memberData;
		memberDatas.add(memberData);
		
	}

	public Member getMemberData() {
		return memberData;
	}

	public void setMemberData(Member memberData) {
		memberDatas.add(memberData);
	}
}
