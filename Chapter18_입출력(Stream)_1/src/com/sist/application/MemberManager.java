package com.sist.application;
// => CRUD => 추가 , 수정 ,삭제 , 읽기
import java.util.*;
import java.io.*;
public class MemberManager {
   private final String FILE_NAME="c:\\java_data\\member.txt";
   // 추가
   public void create(Scanner scan)
   {
	   System.out.print("이름 입력:");
	   String name=scan.next();
	   System.out.print("성별 입력:");
	   String sex=scan.next();
	   System.out.print("주소 입력:");
	   String address=scan.next();
	   
	   String member=name+"|"+sex+"|"+address+"\n";
	   // try - with - resource
	   // => 자동 close() => finally 사용을 안 해도 됨
	   try(FileWriter fw=new FileWriter(FILE_NAME,true))
	   {
		   fw.write(member);
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   System.out.println("회원 가입 완료!!");
   }
   // 수정
   public void update(MemberVO mvo,int no)
   {
	   FileWriter fw=null;
	   try
	   {
		 //  fw=new FileWriter(FILE_NAME);
		   List<MemberVO> list=read();
		   list.set(no-1, mvo);
		   String data="";
		   for(MemberVO vo:list)
		   {
			   data+=vo.getName()+"|"+vo.getSex()+"|"+vo.getAddress()+"\n";
		   }
		   fw=new FileWriter(FILE_NAME);
		   fw.write(data);
		   System.out.println("회원 수정 완료");
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fw.close();
		   }catch(Exception ex) {}
	   }
   }
   // 삭제
   public void delete(int no)
   {
	   FileWriter fw=null;
	   try
	   {
		   List<MemberVO> list=read();
		   list.remove(no-1);
		   String data="";
		   for(MemberVO vo:list)
		   {
			   data+=vo.getName()+"|"+vo.getSex()+"|"+vo.getAddress()+"\n";
		   }
		   fw=new FileWriter(FILE_NAME);
		   fw.write(data);
		   System.out.println("회원 탈퇴 완료");
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fw.close();
		   }
		   catch(Exception ex)
		   {
			   
		   }
	   }
   }
   // 읽기
   public List<MemberVO> read()
   {
	   List<MemberVO> list=new ArrayList<MemberVO>();
	   FileReader fr=null;
	   try
	   {
		   fr=new FileReader(FILE_NAME);
		   String data="";
		   int i=0;
		   while((i=fr.read())!=-1)
		   {
			   data+=(char)i;
		   }
		   String[] datas=data.split("\n");
		   for(String m:datas)
		   {
			   StringTokenizer st=new StringTokenizer(m,"|");
			   MemberVO vo=new MemberVO();
			   vo.setName(st.nextToken());
			   vo.setSex(st.nextToken());
			   vo.setAddress(st.nextToken());
			   list.add(vo);
		   }
	   }
	   catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   fr.close();
		   }catch(Exception ex) {}
	   }
	   return list;
   }
}
