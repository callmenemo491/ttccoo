package p168ja;

/* renamed from: ja.a */
/* loaded from: classes.dex */
public class C3456a {

    /* renamed from: b */
    public static final ga.C2310a f14928b = null;

    /* renamed from: c */
    public static final java.lang.String f14929c = null;

    /* renamed from: d */
    public static final java.lang.String f14930d = null;

    /* renamed from: e */
    public static final p335t3.InterfaceC6152e<p094fa.AbstractC2103a0, byte[]> f14931e = null;

    /* renamed from: a */
    public final p335t3.InterfaceC6153f<p094fa.AbstractC2103a0> f14932a;

    static {
            ga.a r0 = new ga.a
            r0.<init>()
            p168ja.C3456a.f14928b = r0
            java.lang.String r0 = "hts/cahyiseot-agolai.o/1frlglgc/aclg"
            java.lang.String r1 = "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho"
            java.lang.String r0 = m7917a(r0, r1)
            p168ja.C3456a.f14929c = r0
            java.lang.String r0 = "AzSBpY4F0rHiHFdinTvM"
            java.lang.String r1 = "IayrSTFL9eJ69YeSUO2"
            java.lang.String r0 = m7917a(r0, r1)
            p168ja.C3456a.f14930d = r0
            androidx.room.a r0 = androidx.room.C0618a.f3668r0
            p168ja.C3456a.f14931e = r0
            return
    }

    public C3456a(p335t3.InterfaceC6153f<p094fa.AbstractC2103a0> r1, p335t3.InterfaceC6152e<p094fa.AbstractC2103a0, byte[]> r2) {
            r0 = this;
            r0.<init>()
            r0.f14932a = r1
            return
    }

    /* renamed from: a */
    public static java.lang.String m7917a(java.lang.String r3, java.lang.String r4) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r0 = r0 - r1
            if (r0 < 0) goto L3f
            r1 = 1
            if (r0 > r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r2 = r2 + r1
            r0.<init>(r2)
            r1 = 0
        L1d:
            int r2 = r3.length()
            if (r1 >= r2) goto L3a
            char r2 = r3.charAt(r1)
            r0.append(r2)
            int r2 = r4.length()
            if (r2 <= r1) goto L37
            char r2 = r4.charAt(r1)
            r0.append(r2)
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
        L3f:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "Invalid input received"
            r3.<init>(r4)
            throw r3
    }
}
