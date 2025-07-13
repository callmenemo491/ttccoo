package p121h4;

/* renamed from: h4.n */
/* loaded from: classes.dex */
public interface InterfaceC2473n {

    /* renamed from: h4.n$a */
    public static final class a {

        /* renamed from: a */
        public final android.os.Handler f11063a;

        /* renamed from: b */
        public final p121h4.InterfaceC2473n f11064b;

        public a(android.os.Handler r1, p121h4.InterfaceC2473n r2) {
                r0 = this;
                r0.<init>()
                if (r2 == 0) goto L9
                java.util.Objects.requireNonNull(r1)
                goto La
            L9:
                r1 = 0
            La:
                r0.f11063a = r1
                r0.f11064b = r2
                return
        }

        /* renamed from: a */
        public void m6265a(p142i4.C3071e r4) {
                r3 = this;
                monitor-enter(r4)
                monitor-exit(r4)
                android.os.Handler r0 = r3.f11063a
                if (r0 == 0) goto Lf
                h4.h r1 = new h4.h
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.post(r1)
            Lf:
                return
        }
    }

    /* renamed from: A */
    void mo5278A(java.lang.Exception r1);

    /* renamed from: C */
    void mo5280C(long r1);

    /* renamed from: G */
    void mo5281G(p088f4.C2003e0 r1, p142i4.C3075i r2);

    @java.lang.Deprecated
    /* renamed from: H */
    void mo5282H(p088f4.C2003e0 r1);

    /* renamed from: I */
    void mo5283I(java.lang.Exception r1);

    /* renamed from: V */
    void mo5287V(java.lang.String r1);

    /* renamed from: W */
    void mo5288W(java.lang.String r1, long r2, long r4);

    /* renamed from: b0 */
    void mo5289b0(p142i4.C3071e r1);

    /* renamed from: c */
    void mo5290c(boolean r1);

    /* renamed from: c0 */
    void mo5291c0(int r1, long r2, long r4);

    /* renamed from: m */
    void mo5299m(p142i4.C3071e r1);
}
