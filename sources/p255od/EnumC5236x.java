package p255od;

/* renamed from: od.x */
/* loaded from: classes.dex */
public enum EnumC5236x extends java.lang.Enum<p255od.EnumC5236x> {
    private static final /* synthetic */ p255od.EnumC5236x[] $VALUES = null;
    public static final p255od.EnumC5236x LOAD = null;
    public static final p255od.EnumC5236x SIGN = null;
    private final java.lang.String value;

    private static final /* synthetic */ p255od.EnumC5236x[] $values() {
            r0 = 2
            od.x[] r0 = new p255od.EnumC5236x[r0]
            od.x r1 = p255od.EnumC5236x.LOAD
            r2 = 0
            r0[r2] = r1
            od.x r1 = p255od.EnumC5236x.SIGN
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            od.x r0 = new od.x
            java.lang.String r1 = "LOAD"
            r2 = 0
            java.lang.String r3 = "load2()"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5236x.LOAD = r0
            od.x r0 = new od.x
            java.lang.String r1 = "SIGN"
            r2 = 1
            java.lang.String r3 = "sign2()"
            r0.<init>(r1, r2, r3)
            p255od.EnumC5236x.SIGN = r0
            od.x[] r0 = $values()
            p255od.EnumC5236x.$VALUES = r0
            return
    }

    EnumC5236x(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static p255od.EnumC5236x valueOf(java.lang.String r1) {
            java.lang.Class<od.x> r0 = p255od.EnumC5236x.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            od.x r1 = (p255od.EnumC5236x) r1
            return r1
    }

    public static p255od.EnumC5236x[] values() {
            od.x[] r0 = p255od.EnumC5236x.$VALUES
            java.lang.Object r0 = r0.clone()
            od.x[] r0 = (p255od.EnumC5236x[]) r0
            return r0
    }

    public final java.lang.String getValue() {
            r1 = this;
            java.lang.String r0 = r1.value
            return r0
    }
}
