package p162j4;

/* renamed from: j4.r */
/* loaded from: classes.dex */
public final class C3413r implements p142i4.InterfaceC3068b {

    /* renamed from: d */
    public static final boolean f14755d = false;

    /* renamed from: a */
    public final java.util.UUID f14756a;

    /* renamed from: b */
    public final byte[] f14757b;

    /* renamed from: c */
    public final boolean f14758c;

    static {
            java.lang.String r0 = p371v5.C6552b0.f25626c
            java.lang.String r1 = "Amazon"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
            java.lang.String r0 = p371v5.C6552b0.f25627d
            java.lang.String r1 = "AFTM"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L1c
            java.lang.String r1 = "AFTB"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L1e
        L1c:
            r0 = 1
            goto L1f
        L1e:
            r0 = 0
        L1f:
            p162j4.C3413r.f14755d = r0
            return
    }

    public C3413r(java.util.UUID r1, byte[] r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.f14756a = r1
            r0.f14757b = r2
            r0.f14758c = r3
            return
    }
}
