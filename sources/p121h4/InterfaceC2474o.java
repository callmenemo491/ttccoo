package p121h4;

/* renamed from: h4.o */
/* loaded from: classes.dex */
public interface InterfaceC2474o {

    /* renamed from: h4.o$a */
    public static final class a extends java.lang.Exception {

        /* renamed from: Y */
        public final p088f4.C2003e0 f11065Y;

        public a(java.lang.String r1, p088f4.C2003e0 r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f11065Y = r2
                return
        }

        public a(java.lang.Throwable r1, p088f4.C2003e0 r2) {
                r0 = this;
                r0.<init>(r1)
                r0.f11065Y = r2
                return
        }
    }

    /* renamed from: h4.o$b */
    public static final class b extends java.lang.Exception {

        /* renamed from: Y */
        public final boolean f11066Y;

        /* renamed from: Z */
        public final p088f4.C2003e0 f11067Z;

        public b(int r4, int r5, int r6, int r7, p088f4.C2003e0 r8, boolean r9, java.lang.Exception r10) {
                r3 = this;
                if (r9 == 0) goto L5
                java.lang.String r0 = " (recoverable)"
                goto L7
            L5:
                java.lang.String r0 = ""
            L7:
                int r1 = r0.length()
                int r1 = r1 + 80
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>(r1)
                java.lang.String r1 = "AudioTrack init failed "
                r2.append(r1)
                r2.append(r4)
                java.lang.String r4 = " "
                r2.append(r4)
                java.lang.String r4 = "Config("
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = ", "
                r2.append(r4)
                r2.append(r6)
                r2.append(r4)
                r2.append(r7)
                java.lang.String r4 = ")"
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4, r10)
                r3.f11066Y = r9
                r3.f11067Z = r8
                return
        }
    }

    /* renamed from: h4.o$c */
    public interface c {
    }

    /* renamed from: h4.o$d */
    public static final class d extends java.lang.Exception {
        public d(long r3, long r5) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 103(0x67, float:1.44E-43)
                r0.<init>(r1)
                java.lang.String r1 = "Unexpected audio track timestamp discontinuity: expected "
                r0.append(r1)
                r0.append(r5)
                java.lang.String r5 = ", got "
                r0.append(r5)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r2.<init>(r3)
                return
        }
    }

    /* renamed from: h4.o$e */
    public static final class e extends java.lang.Exception {

        /* renamed from: Y */
        public final boolean f11068Y;

        /* renamed from: Z */
        public final p088f4.C2003e0 f11069Z;

        public e(int r3, p088f4.C2003e0 r4, boolean r5) {
                r2 = this;
                r0 = 36
                java.lang.String r1 = "AudioTrack write failed: "
                java.lang.String r3 = p064e.C1490d.m4039a(r0, r1, r3)
                r2.<init>(r3)
                r2.f11068Y = r5
                r2.f11069Z = r4
                return
        }
    }

    /* renamed from: a */
    void mo6266a(p121h4.C2477r r1);

    /* renamed from: b */
    void mo6267b();

    /* renamed from: c */
    void mo6268c(p088f4.C2052w0 r1);

    /* renamed from: d */
    boolean mo6269d();

    /* renamed from: e */
    p088f4.C2052w0 mo6270e();

    /* renamed from: f */
    boolean mo6271f(p088f4.C2003e0 r1);

    void flush();

    /* renamed from: g */
    void mo6272g();

    /* renamed from: h */
    void mo6273h(p121h4.C2461d r1);

    /* renamed from: i */
    void mo6274i();

    /* renamed from: j */
    void mo6275j();

    /* renamed from: k */
    boolean mo6276k();

    /* renamed from: l */
    int mo6277l(p088f4.C2003e0 r1);

    /* renamed from: m */
    void mo6278m(int r1);

    /* renamed from: n */
    boolean mo6279n(java.nio.ByteBuffer r1, long r2, int r4);

    /* renamed from: o */
    long mo6280o(boolean r1);

    /* renamed from: p */
    void mo6281p();

    /* renamed from: q */
    void mo6282q();

    /* renamed from: r */
    void mo6283r(p121h4.InterfaceC2474o.c r1);

    /* renamed from: s */
    void mo6284s(p088f4.C2003e0 r1, int r2, int[] r3);

    /* renamed from: t */
    void mo6285t(boolean r1);

    /* renamed from: u */
    void mo6286u();

    /* renamed from: v */
    void mo6287v(float r1);
}
