package actions.views;

import java.time.LocalDate;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 日報情報について画面の入力値・出力値を扱うViewモデル
 */

@Getter //すべてのクラスフィールドについてgetterを自動生成
@Setter //すべてのクラスフィールドについてsetterを自動生成
@NoArgsConstructor //引数なしのコンストラクタを自動生成する
@AllArgsConstructor //すべてのクラスフィールドを引数にもつ引数ありのコンストラクタを自動生成する


public class ReportView {

	/**
	 * id
	 */
	private Integer id;

	/**
	 * 日報を登録した従業員
	 */

	private EmployeeView employee;

	/**
	 * いつかの日報を示す日付
	 */
	private LocalDate reportDate;

	/**
	 * 日報のタイトル
	 */
	private String title;

	/**
	 * 日報の内容
	 */

	private String content;

	/**
	 * 登録日時
	 */
	private LocalDateTime createdAt;

	/**
	 * 更新日時
	 */
	private LocalDateTime updatedAt;


}
