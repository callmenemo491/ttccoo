package p325s5;

/* renamed from: s5.a */
/* loaded from: classes.dex */
public class C5961a extends p325s5.AbstractC5963c {

    /* renamed from: f */
    public final p352u5.InterfaceC6308c f22918f;

    /* renamed from: g */
    public final p371v5.InterfaceC6553c f22919g;

    /* renamed from: s5.a$a */
    public static final class a {

        /* renamed from: a */
        public final long f22920a;

        /* renamed from: b */
        public final long f22921b;

        public a(long r1, long r3) {
                r0 = this;
                r0.<init>()
                r0.f22920a = r1
                r0.f22921b = r3
                return
        }

        public boolean equals(java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                boolean r1 = r8 instanceof p325s5.C5961a.a
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                s5.a$a r8 = (p325s5.C5961a.a) r8
                long r3 = r7.f22920a
                long r5 = r8.f22920a
                int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r1 != 0) goto L1d
                long r3 = r7.f22921b
                long r5 = r8.f22921b
                int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r8 != 0) goto L1d
                goto L1e
            L1d:
                r0 = 0
            L1e:
                return r0
        }

        public int hashCode() {
                r4 = this;
                long r0 = r4.f22920a
                int r1 = (int) r0
                int r1 = r1 * 31
                long r2 = r4.f22921b
                int r0 = (int) r2
                int r1 = r1 + r0
                return r1
        }
    }

    /* renamed from: s5.a$b */
    public static class b implements p325s5.InterfaceC5966f.b {

        /* renamed from: a */
        public final p371v5.InterfaceC6553c f22922a;

        public b() {
                r1 = this;
                v5.c r0 = p371v5.InterfaceC6553c.f25635a
                r1.<init>()
                r1.f22922a = r0
                return
        }
    }

    public C5961a(p108g5.C2271h0 r4, int[] r5, int r6, p352u5.InterfaceC6308c r7, long r8, long r10, long r12, int r14, int r15, float r16, float r17, java.util.List<p325s5.C5961a.a> r18, p371v5.InterfaceC6553c r19) {
            r3 = this;
            r0 = r3
            r3.<init>(r4, r5, r6)
            int r1 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r1 >= 0) goto Lf
            java.lang.String r1 = "AdaptiveTrackSelection"
            java.lang.String r2 = "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs"
            android.util.Log.w(r1, r2)
        Lf:
            r1 = r7
            r0.f22918f = r1
            p026b9.AbstractC0714n.m2311w(r18)
            r1 = r19
            r0.f22919g = r1
            return
    }

    /* renamed from: m */
    public static void m12404m(java.util.List<p026b9.AbstractC0714n.a<p325s5.C5961a.a>> r7, long[] r8) {
            r0 = 0
            r1 = 0
            r3 = 0
        L4:
            int r4 = r8.length
            if (r3 >= r4) goto Ld
            r4 = r8[r3]
            long r1 = r1 + r4
            int r3 = r3 + 1
            goto L4
        Ld:
            int r3 = r7.size()
            if (r0 >= r3) goto L29
            java.lang.Object r3 = r7.get(r0)
            b9.n$a r3 = (p026b9.AbstractC0714n.a) r3
            if (r3 != 0) goto L1c
            goto L26
        L1c:
            s5.a$a r4 = new s5.a$a
            r5 = r8[r0]
            r4.<init>(r1, r5)
            r3.m2316b(r4)
        L26:
            int r0 = r0 + 1
            goto Ld
        L29:
            return
    }

    @Override // p325s5.AbstractC5963c, p325s5.InterfaceC5966f
    /* renamed from: c */
    public void mo12405c() {
            r0 = this;
            return
    }

    @Override // p325s5.InterfaceC5966f
    /* renamed from: g */
    public int mo12406g() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p325s5.AbstractC5963c, p325s5.InterfaceC5966f
    /* renamed from: h */
    public void mo12407h() {
            r0 = this;
            return
    }

    @Override // p325s5.AbstractC5963c, p325s5.InterfaceC5966f
    /* renamed from: i */
    public void mo12408i(float r1) {
            r0 = this;
            return
    }
}
