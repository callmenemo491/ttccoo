package vg;

/* renamed from: vg.n */
/* loaded from: classes.dex */
public final class C6673n extends p239nh.AbstractC4830j implements mh.InterfaceC4620l<java.lang.Byte, java.lang.CharSequence> {

    /* renamed from: Z */
    public static final vg.C6673n f25946Z = null;

    static {
            vg.n r0 = new vg.n
            r0.<init>()
            vg.C6673n.f25946Z = r0
            return
    }

    public C6673n() {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            return
    }

    @Override // mh.InterfaceC4620l
    /* renamed from: b */
    public java.lang.CharSequence mo107b(java.lang.Byte r3) {
            r2 = this;
            java.lang.Number r3 = (java.lang.Number) r3
            byte r3 = r3.byteValue()
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "%02x"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            java.lang.String r0 = "format(\"%02x\", it)"
            p214m2.C4339q.m9705j(r3, r0)
            return r3
    }
}
