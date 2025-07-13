package je;

/* renamed from: je.b */
/* loaded from: classes.dex */
public enum EnumC3580b extends java.lang.Enum<je.EnumC3580b> {

    /* renamed from: Y */
    public static final je.EnumC3580b f15694Y = null;

    /* renamed from: Z */
    public static final je.EnumC3580b f15695Z = null;

    /* renamed from: a0 */
    public static final /* synthetic */ je.EnumC3580b[] f15696a0 = null;

    static {
            je.b r0 = new je.b
            java.lang.String r1 = "BUY"
            r2 = 0
            r0.<init>(r1, r2)
            je.EnumC3580b.f15694Y = r0
            je.b r1 = new je.b
            java.lang.String r3 = "SELL"
            r4 = 1
            r1.<init>(r3, r4)
            je.EnumC3580b.f15695Z = r1
            r3 = 2
            je.b[] r3 = new je.EnumC3580b[r3]
            r3[r2] = r0
            r3[r4] = r1
            je.EnumC3580b.f15696a0 = r3
            return
    }

    EnumC3580b(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static je.EnumC3580b valueOf(java.lang.String r1) {
            java.lang.Class<je.b> r0 = je.EnumC3580b.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            je.b r1 = (je.EnumC3580b) r1
            return r1
    }

    public static je.EnumC3580b[] values() {
            je.b[] r0 = je.EnumC3580b.f15696a0
            java.lang.Object r0 = r0.clone()
            je.b[] r0 = (je.EnumC3580b[]) r0
            return r0
    }
}
