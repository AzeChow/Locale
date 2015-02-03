// 初始化运费
		this.cbbFreightageType.removeAllItems();
		this.cbbFreightageType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.FREIGHT_RATE), "运费率"));
		this.cbbFreightageType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.FREIGHT_UNITPRICE), "运费单价/吨"));
		this.cbbFreightageType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.FREIGHT_TOTALPRICE), "运费总价"));
		this.cbbFreightageType.setRenderer(CustomBaseRender.getInstance()
				.getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbFreightageType);
		// 初始化运保费
		this.cbbInsuranceType.removeAllItems();
		this.cbbInsuranceType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.INSURANCE_RATE), "保费率"));
		this.cbbInsuranceType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.INSURANCE_TOTALPRICE), "保费总价"));
		this.cbbInsuranceType.setRenderer(CustomBaseRender.getInstance()
				.getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbInsuranceType);
		// 初始化杂费
		this.cbbIncidentalExpensesType.removeAllItems();
		this.cbbIncidentalExpensesType.addItem(new ItemProperty(String
				.valueOf(BaseCustomsDeclaration.INCEDENTAL_EXPENSES_RATE),
				"杂费率"));
		this.cbbIncidentalExpensesType
				.addItem(new ItemProperty(
						String.valueOf(BaseCustomsDeclaration.INCEDENTAL_EXPENSES_TOTALPRICE),
						"杂费总价"));
		this.cbbIncidentalExpensesType.setRenderer(CustomBaseRender
				.getInstance().getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbIncidentalExpensesType);
				
				
				// 初始化币制
		this.cbbCurrency.setModel(CustomBaseModel.getInstance().getCurrModel());
		this.cbbCurrency
				.setRenderer(CustomBaseRender.getInstance().getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbCurrency);
		// 初始化保费币制
		this.cbbFeeCurr.setModel(CustomBaseModel.getInstance().getCurrModel());
		this.cbbFeeCurr.setRenderer(CustomBaseRender.getInstance().getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbFeeCurr);
		// 初始化运费币制
		this.cbbInsurCurr
				.setModel(CustomBaseModel.getInstance().getCurrModel());
		this.cbbInsurCurr.setRenderer(CustomBaseRender.getInstance()
				.getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbInsurCurr);
		// 初始化杂费币制
		this.cbbOtherCurr
				.setModel(CustomBaseModel.getInstance().getCurrModel());
		this.cbbOtherCurr.setRenderer(CustomBaseRender.getInstance()
				.getRender());
		CustomBaseComboBoxEditor.getInstance().setComboBoxEditor(
				this.cbbOtherCurr);
				
				
				tfFreightage 运费
				tfInsurance  保费
				tfIncidentalExpenses 杂费
				JCustomFormattedTextField(
				
					/**
	 * 运费率
	 */
	public static final int FREIGHT_RATE = 1;

	/**
	 * 运费单价
	 */
	public static final int FREIGHT_UNITPRICE = 2;

	/**
	 * 运费总价
	 */
	public static final int FREIGHT_TOTALPRICE = 3;

	/**
	 * 保费率
	 */
	
	public static final int INSURANCE_RATE = 1;

	/**
	 * 保费总价
	 */
	public static final int INSURANCE_TOTALPRICE = 3;

	/**
	 * 杂费率
	 */
	public static final int INCEDENTAL_EXPENSES_RATE = 1;

	/**
	 * 杂费总价
	 */
	public static final int INCEDENTAL_EXPENSES_TOTALPRICE = 3;
	
	
	/**
	 * 运费类型 FREIGHT_RATE = 1; 运费率 FREIGHT_UNITPRICE = 2; 运费单价 FREIGHT_TOTALPRICE =
	 * 3; 运费总价
	 */
	private Integer freightageType;

	/**
	 * 运费
	 */
	private Double freightage;

	/**
	 * 运费币制
	 */
	private Curr feeCurr;

	/**
	 * 保险费类型 INSURANCE_RATE = 1; 保费率 INSURANCE_TOTALPRICE = 3; 保费总价
	 */
	private Integer insuranceType;

	/**
	 * 保险费
	 */
	private Double insurance;

	/**
	 * 保费币制
	 */
	private Curr insurCurr;

	/**
	 * 杂费类型 INCEDENTAL_EXPENSES_RATE = 1; 杂费率 INCEDENTAL_EXPENSES_TOTALPRICE =
	 * 3; 杂费总价
	 */
	private Integer incidentalExpensesType;

	/**
	 * 杂费
	 */
	private Double incidentalExpenses;

	/**
	 * 杂费币制
	 */
	private Curr otherCurr;
