package cl.votainteligente.inspector.client.views;

import cl.votainteligente.inspector.client.presenters.BillPresenter;
import cl.votainteligente.inspector.client.presenters.BillPresenterIface;
import cl.votainteligente.inspector.model.Parlamentarian;
import cl.votainteligente.inspector.model.Society;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Widget;

import java.util.Date;

public class BillView extends Composite implements BillPresenter.Display {
	private static BillViewUiBinder uiBinder = GWT.create(BillViewUiBinder.class);
	interface BillViewUiBinder extends UiBinder<Widget, BillView> {}

	@UiField Label billBulletinNumber;
	@UiField Label billTitle;
	@UiField Label billEntryDate;
	@UiField Label billInitiativeType;
	@UiField Label billType;
	@UiField Label billOriginChamber;
	@UiField Label billUrgency;
	@UiField Label billStage;
	@UiField CellTable<Parlamentarian> parlamentarianTable;
	@UiField CellTable<Society> societyTable;

	BillPresenterIface presenter;

	public BillView() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@Override
	public Widget asWidget() {
		return this;
	}

	@Override
	public void setPresenter(BillPresenterIface presenter) {
		this.presenter = presenter;
	}

	@Override
	public String getBillBulletinNumber() {
		return billBulletinNumber.getText();
	}

	@Override
	public void setBillBulletinNumber(String billBulletinNumber) {
		this.billBulletinNumber.setText(billBulletinNumber);
	}

	@Override
	public String getBillTitle() {
		return billTitle.getText();
	}

	@Override
	public void setBillTitle(String billTitle) {
		this.billTitle.setText(billTitle);
	}

	@Override
	public String getBillEntryDate() {
		return billEntryDate.getText();
	}

	@Override
	public void setBillEntryDate(Date billEntryDate) {
		this.billEntryDate.setText(DateTimeFormat.getFormat("dd/MM/yyyy HH:mm").format(billEntryDate));
	}

	@Override
	public String getBillInitiativeType() {
		return billInitiativeType.getText();
	}

	@Override
	public void setBillInitiativeType(String billInitiativeType) {
		this.billInitiativeType.setText(billInitiativeType);
	}

	@Override
	public String getBillType() {
		return billType.getText();
	}

	@Override
	public void setBillType(String billType) {
		this.billType.setText(billType);
	}


	@Override
	public String getBillOriginChamber() {
		return billOriginChamber.getText();
	}

	@Override
	public void setBillOriginChamber(String billOriginChamber) {
		this.billOriginChamber.setText(billOriginChamber);
	}

	@Override
	public String getBillUrgency() {
		return billUrgency.getText();
	}

	@Override
	public void setBillUrgency(String billUrgency) {
		this.billStage.setText(billUrgency);
	}

	@Override
	public String getBillStage() {
		return billStage.getText();
	}

	@Override
	public void setBillStage(String billStage) {
		this.billStage.setText(billStage);
	}
}
