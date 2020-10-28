/* Siva Sankar
 * 411752
 */

package cricbuzz;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.SystemColor;

public class SettingsPanel {

	JPanel panelS;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	
	public SettingsPanel() {
		initialize();
	}

	private void initialize() {
		panelS=new JPanel();
		panelS.setBackground(SystemColor.inactiveCaptionBorder);
		
		JTextArea txtrDarkTheme = new JTextArea();
		txtrDarkTheme.setBackground(SystemColor.inactiveCaptionBorder);
		txtrDarkTheme.setEditable(false);
		txtrDarkTheme.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrDarkTheme.setText("Dark Theme ");
		
		JTextArea txtrLightTextAgainst = new JTextArea();
		txtrLightTextAgainst.setForeground(Color.RED);
		txtrLightTextAgainst.setBackground(SystemColor.inactiveCaptionBorder);
		txtrLightTextAgainst.setEditable(false);
		txtrLightTextAgainst.setText("Light text against dark background");
		
		JLabel label = new JLabel("");
		label.setBackground(SystemColor.inactiveCaptionBorder);
		
		JTextArea txtrAutomaticDataRefresh = new JTextArea();
		txtrAutomaticDataRefresh.setBackground(SystemColor.inactiveCaptionBorder);
		txtrAutomaticDataRefresh.setEditable(false);
		txtrAutomaticDataRefresh.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrAutomaticDataRefresh.setText("Automatic data refresh");
		
		JTextArea txtrManualRefreshI = new JTextArea();
		txtrManualRefreshI.setBackground(SystemColor.inactiveCaptionBorder);
		txtrManualRefreshI.setEditable(false);
		txtrManualRefreshI.setText("Manual refresh i still available");
		
		JLabel label_1 = new JLabel("");
		label_1.setBackground(SystemColor.inactiveCaptionBorder);
		
		JTextArea txtrEffectsDataUsage = new JTextArea();
		txtrEffectsDataUsage.setBackground(SystemColor.inactiveCaptionBorder);
		txtrEffectsDataUsage.setEditable(false);
		txtrEffectsDataUsage.setText("Effects data usage");
		
		JTextArea txtrLowQualityVideo = new JTextArea();
		txtrLowQualityVideo.setBackground(SystemColor.inactiveCaptionBorder);
		txtrLowQualityVideo.setEditable(false);
		txtrLowQualityVideo.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrLowQualityVideo.setText("Low Quality Video Playback");
		
		JTextArea txtrSaveDataOn = new JTextArea();
		txtrSaveDataOn.setBackground(SystemColor.inactiveCaptionBorder);
		txtrSaveDataOn.setEditable(false);
		txtrSaveDataOn.setText("save data on video streaming");
		
		JTextArea txtrVideoLanguage = new JTextArea();
		txtrVideoLanguage.setBackground(SystemColor.inactiveCaptionBorder);
		txtrVideoLanguage.setEditable(false);
		txtrVideoLanguage.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrVideoLanguage.setText("Video Language");
		
		JTextArea txtrPleaseSelectYour = new JTextArea();
		txtrPleaseSelectYour.setBackground(SystemColor.inactiveCaptionBorder);
		txtrPleaseSelectYour.setEditable(false);
		txtrPleaseSelectYour.setText("Please select your preferred language for videos");
		
		JTextArea txtrNotifications = new JTextArea();
		txtrNotifications.setBackground(SystemColor.inactiveCaptionBorder);
		txtrNotifications.setEditable(false);
		txtrNotifications.setForeground(Color.GREEN);
		txtrNotifications.setFont(new Font("Dialog", Font.PLAIN, 19));
		txtrNotifications.setText("NOTIFICATIONS");
		
		JTextArea txtrAllowNotifications = new JTextArea();
		txtrAllowNotifications.setBackground(SystemColor.inactiveCaptionBorder);
		txtrAllowNotifications.setEditable(false);
		txtrAllowNotifications.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrAllowNotifications.setText("Allow Notifications");
		
		JTextArea txtrSound = new JTextArea();
		txtrSound.setBackground(SystemColor.inactiveCaptionBorder);
		txtrSound.setEditable(false);
		txtrSound.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrSound.setText("Sound");
		
		JTextArea txtrVibration = new JTextArea();
		txtrVibration.setBackground(SystemColor.inactiveCaptionBorder);
		txtrVibration.setEditable(false);
		txtrVibration.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrVibration.setText("Vibration");
		
		JTextArea txtrDoNotDisturb = new JTextArea();
		txtrDoNotDisturb.setBackground(SystemColor.inactiveCaptionBorder);
		txtrDoNotDisturb.setEditable(false);
		txtrDoNotDisturb.setText("   DO NOT DISTURB");
		txtrDoNotDisturb.setForeground(Color.GREEN);
		txtrDoNotDisturb.setFont(new Font("Dialog", Font.PLAIN, 19));
		
		JTextArea txtrDoNotDisturb_1 = new JTextArea();
		txtrDoNotDisturb_1.setBackground(SystemColor.inactiveCaptionBorder);
		txtrDoNotDisturb_1.setEditable(false);
		txtrDoNotDisturb_1.setText("Do not disturb");
		txtrDoNotDisturb_1.setFont(new Font("Dialog", Font.PLAIN, 15));
		
		JTextArea txtrNotificationsWillNot = new JTextArea();
		txtrNotificationsWillNot.setBackground(SystemColor.inactiveCaptionBorder);
		txtrNotificationsWillNot.setEditable(false);
		txtrNotificationsWillNot.setText("Notifications will not make sound or vibrate");
		
		JTextArea txtrFrom = new JTextArea();
		txtrFrom.setBackground(SystemColor.inactiveCaptionBorder);
		txtrFrom.setEditable(false);
		txtrFrom.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrFrom.setText("From ");
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(SystemColor.inactiveCaptionBorder);
		textArea.setEditable(false);
		textArea.setText("00:00");
		
		textField_2 = new JTextField();
		textField_2.setBackground(SystemColor.inactiveCaptionBorder);
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		JTextArea txtrTo = new JTextArea();
		txtrTo.setBackground(SystemColor.inactiveCaptionBorder);
		txtrTo.setEditable(false);
		txtrTo.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrTo.setText("To");
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBackground(SystemColor.inactiveCaptionBorder);
		textArea_1.setEditable(false);
		textArea_1.setText("00:00");
		
		JTextArea txtrPrimaryNotifications = new JTextArea();
		txtrPrimaryNotifications.setBackground(SystemColor.inactiveCaptionBorder);
		txtrPrimaryNotifications.setEditable(false);
		txtrPrimaryNotifications.setText("PRIMARY NOTIFICATIONS");
		txtrPrimaryNotifications.setForeground(Color.GREEN);
		txtrPrimaryNotifications.setFont(new Font("Dialog", Font.PLAIN, 19));
		
		JTextArea txtrRecommenendedStories = new JTextArea();
		txtrRecommenendedStories.setBackground(SystemColor.inactiveCaptionBorder);
		txtrRecommenendedStories.setEditable(false);
		txtrRecommenendedStories.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrRecommenendedStories.setText("Recommenended Stories");
		
		JTextArea txtrNotifyAboutAll = new JTextArea();
		txtrNotifyAboutAll.setBackground(SystemColor.inactiveCaptionBorder);
		txtrNotifyAboutAll.setEditable(false);
		txtrNotifyAboutAll.setText("Notify about all the interesting/useful stories");
		
		JTextArea txtrBreakingNews = new JTextArea();
		txtrBreakingNews.setBackground(SystemColor.inactiveCaptionBorder);
		txtrBreakingNews.setEditable(false);
		txtrBreakingNews.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrBreakingNews.setText("Breaking News");
		
		JTextPane txtpnNotifyAboutAll = new JTextPane();
		txtpnNotifyAboutAll.setBackground(SystemColor.inactiveCaptionBorder);
		txtpnNotifyAboutAll.setEditable(false);
		txtpnNotifyAboutAll.setText("notify about all the breaking news happening inside the cricketing world");
		
		textField_3 = new JTextField();
		textField_3.setBackground(SystemColor.inactiveCaptionBorder);
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JTextArea txtrVideoAlerts = new JTextArea();
		txtrVideoAlerts.setBackground(SystemColor.inactiveCaptionBorder);
		txtrVideoAlerts.setEditable(false);
		txtrVideoAlerts.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrVideoAlerts.setText("Video Alerts ");
		
		JTextArea txtrNotifyAboutRecommended = new JTextArea();
		txtrNotifyAboutRecommended.setBackground(SystemColor.inactiveCaptionBorder);
		txtrNotifyAboutRecommended.setEditable(false);
		txtrNotifyAboutRecommended.setText("Notify about recommended videos");
		
		textField_4 = new JTextField();
		textField_4.setBackground(SystemColor.inactiveCaptionBorder);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		JTextArea txtrLiveVideoAlerts = new JTextArea();
		txtrLiveVideoAlerts.setBackground(SystemColor.inactiveCaptionBorder);
		txtrLiveVideoAlerts.setEditable(false);
		txtrLiveVideoAlerts.setFont(new Font("Dialog", Font.PLAIN, 15));
		txtrLiveVideoAlerts.setText("Live Video Alerts");
		
		JTextArea txtrNotifyAboutLive = new JTextArea();
		txtrNotifyAboutLive.setBackground(SystemColor.inactiveCaptionBorder);
		txtrNotifyAboutLive.setEditable(false);
		txtrNotifyAboutLive.setText("Notify about live videos");
		
		JLabel lblTheme = new JLabel("THEME");
		lblTheme.setBackground(SystemColor.inactiveCaptionBorder);
		lblTheme.setForeground(Color.GREEN);
		lblTheme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblDataSaverOption = new JLabel("DATA  SAVER OPTION");
		lblDataSaverOption.setBackground(SystemColor.inactiveCaptionBorder);
		lblDataSaverOption.setForeground(Color.GREEN);
		lblDataSaverOption.setFont(new Font("Tahoma", Font.PLAIN, 18));
		
		JLabel lblVideoOptions = new JLabel("VIDEO OPTIONS");
		lblVideoOptions.setBackground(SystemColor.inactiveCaptionBorder);
		lblVideoOptions.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblVideoOptions.setForeground(Color.GREEN);
		GroupLayout gl_panelS = new GroupLayout(panelS);
		gl_panelS.setHorizontalGroup(
			gl_panelS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrDarkTheme, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(211)
					.addComponent(label, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrLightTextAgainst, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(187)
							.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrAutomaticDataRefresh, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrManualRefreshI, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrSaveDataOn, GroupLayout.PREFERRED_SIZE, 216, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrLowQualityVideo, GroupLayout.PREFERRED_SIZE, 218, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrPleaseSelectYour, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrAllowNotifications, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrSound, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrVibration, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
				.addComponent(txtrDoNotDisturb, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
				.addComponent(txtrNotificationsWillNot, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrDoNotDisturb_1, GroupLayout.PREFERRED_SIZE, 190, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrFrom, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
				.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 297, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(12)
					.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrTo, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE))
				.addComponent(txtrPrimaryNotifications, GroupLayout.PREFERRED_SIZE, 290, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrRecommenendedStories, GroupLayout.PREFERRED_SIZE, 254, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrNotifyAboutAll, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)))
				.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrNotifyAboutRecommended, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtpnNotifyAboutAll, GroupLayout.PREFERRED_SIZE, 278, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrVideoAlerts, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(12)
					.addComponent(txtrBreakingNews, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE))
				.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrNotifyAboutLive, GroupLayout.PREFERRED_SIZE, 172, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrLiveVideoAlerts, GroupLayout.PREFERRED_SIZE, 239, GroupLayout.PREFERRED_SIZE)))
				.addGroup(gl_panelS.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTheme))
				.addGroup(gl_panelS.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDataSaverOption, GroupLayout.PREFERRED_SIZE, 231, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrEffectsDataUsage, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addGap(10)
					.addComponent(txtrVideoLanguage, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblVideoOptions, GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
				.addGroup(gl_panelS.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtrNotifications, GroupLayout.PREFERRED_SIZE, 280, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(60, Short.MAX_VALUE))
		);
		gl_panelS.setVerticalGroup(
			gl_panelS.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelS.createSequentialGroup()
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(36)
							.addComponent(label, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelS.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblTheme)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panelS.createSequentialGroup()
									.addGap(11)
									.addComponent(txtrDarkTheme, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_panelS.createSequentialGroup()
									.addGap(29)
									.addComponent(txtrLightTextAgainst, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))))
					.addGap(23)
					.addComponent(lblDataSaverOption)
					.addGap(18)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtrAutomaticDataRefresh, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(21)
							.addComponent(txtrManualRefreshI, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addComponent(txtrEffectsDataUsage, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(23)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(20)
							.addComponent(txtrSaveDataOn, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrLowQualityVideo, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(lblVideoOptions, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(txtrVideoLanguage, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addComponent(txtrPleaseSelectYour, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtrNotifications, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(txtrAllowNotifications, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(txtrSound, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(22)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrVibration, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(30)
							.addComponent(txtrDoNotDisturb, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
					.addGap(11)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(17)
							.addComponent(txtrNotificationsWillNot, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrDoNotDisturb_1, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
					.addGap(8)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(4)
							.addComponent(txtrFrom, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(26)
							.addComponent(textArea, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addGap(4)
					.addComponent(txtrTo, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(textArea_1, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(txtrPrimaryNotifications, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addComponent(txtrRecommenendedStories, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(21)
							.addComponent(txtrNotifyAboutAll, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)))
					.addGap(12)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(77)
							.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 61, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(112)
							.addComponent(txtrNotifyAboutRecommended, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(33)
							.addComponent(txtpnNotifyAboutAll, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(88)
							.addComponent(txtrVideoAlerts, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(12)
							.addComponent(txtrBreakingNews, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 81, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(gl_panelS.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelS.createSequentialGroup()
							.addGap(21)
							.addComponent(txtrNotifyAboutLive, GroupLayout.PREFERRED_SIZE, 18, GroupLayout.PREFERRED_SIZE))
						.addComponent(txtrLiveVideoAlerts, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)))
		);
		panelS.setLayout(gl_panelS);
	}
}
