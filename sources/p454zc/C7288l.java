package p454zc;

/* renamed from: zc.l */
/* loaded from: classes.dex */
public class C7288l implements p454zc.InterfaceC7285i {

    /* renamed from: a */
    public java.util.Collection<sb.EnumC6007a> f27953a;

    /* renamed from: b */
    public java.util.Map<sb.EnumC6009c, ?> f27954b;

    /* renamed from: c */
    public java.lang.String f27955c;

    /* renamed from: d */
    public int f27956d;

    public C7288l() {
            r0 = this;
            r0.<init>()
            return
    }

    public C7288l(java.util.Collection<sb.EnumC6007a> r1) {
            r0 = this;
            r0.<init>()
            r0.f27953a = r1
            return
    }

    public C7288l(java.util.Collection<sb.EnumC6007a> r1, java.util.Map<sb.EnumC6009c, ?> r2, java.lang.String r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f27953a = r1
            r0.f27954b = r2
            r0.f27955c = r3
            r0.f27956d = r4
            return
    }

    @Override // p454zc.InterfaceC7285i
    /* renamed from: a */
    public p454zc.C7284h mo14391a(java.util.Map<sb.EnumC6009c, ?> r3) {
            r2 = this;
            java.util.EnumMap r0 = new java.util.EnumMap
            java.lang.Class<sb.c> r1 = sb.EnumC6009c.class
            r0.<init>(r1)
            r0.putAll(r3)
            java.util.Map<sb.c, ?> r3 = r2.f27954b
            if (r3 == 0) goto L11
            r0.putAll(r3)
        L11:
            java.util.Collection<sb.a> r3 = r2.f27953a
            if (r3 == 0) goto L1a
            sb.c r1 = sb.EnumC6009c.f23171a0
            r0.put(r1, r3)
        L1a:
            java.lang.String r3 = r2.f27955c
            if (r3 == 0) goto L23
            sb.c r1 = sb.EnumC6009c.f23173c0
            r0.put(r1, r3)
        L23:
            sb.i r3 = new sb.i
            r3.<init>()
            r3.m12498e(r0)
            int r0 = r2.f27956d
            if (r0 == 0) goto L47
            r1 = 1
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L3b
            zc.h r0 = new zc.h
            r0.<init>(r3)
            return r0
        L3b:
            zc.n r0 = new zc.n
            r0.<init>(r3)
            return r0
        L41:
            zc.m r0 = new zc.m
            r0.<init>(r3)
            return r0
        L47:
            zc.h r0 = new zc.h
            r0.<init>(r3)
            return r0
    }
}
