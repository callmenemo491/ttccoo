package p169jb;

/* renamed from: jb.x */
/* loaded from: classes.dex */
public enum EnumC3481x extends java.lang.Enum<p169jb.EnumC3481x> {

    /* renamed from: Y */
    public static final p169jb.EnumC3481x f14970Y = null;

    /* renamed from: Z */
    public static final /* synthetic */ p169jb.EnumC3481x[] f14971Z = null;

    /* renamed from: jb.x$a */
    public enum a extends p169jb.EnumC3481x {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }
    }


    static {
            jb.x$a r0 = new jb.x$a
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            p169jb.EnumC3481x.f14970Y = r0
            jb.x$b r1 = new jb.x$b
            java.lang.String r3 = "STRING"
            r4 = 1
            r1.<init>(r3, r4)
            r3 = 2
            jb.x[] r3 = new p169jb.EnumC3481x[r3]
            r3[r2] = r0
            r3[r4] = r1
            p169jb.EnumC3481x.f14971Z = r3
            return
    }

    EnumC3481x(java.lang.String r1, int r2, p169jb.EnumC3481x.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static p169jb.EnumC3481x valueOf(java.lang.String r1) {
            java.lang.Class<jb.x> r0 = p169jb.EnumC3481x.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jb.x r1 = (p169jb.EnumC3481x) r1
            return r1
    }

    public static p169jb.EnumC3481x[] values() {
            jb.x[] r0 = p169jb.EnumC3481x.f14971Z
            java.lang.Object r0 = r0.clone()
            jb.x[] r0 = (p169jb.EnumC3481x[]) r0
            return r0
    }
}
