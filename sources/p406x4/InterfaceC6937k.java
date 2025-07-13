package p406x4;

/* renamed from: x4.k */
/* loaded from: classes.dex */
public interface InterfaceC6937k {

    /* renamed from: x4.k$a */
    public static final class a {

        /* renamed from: a */
        public final p406x4.C6939m f27014a;

        /* renamed from: b */
        public final android.media.MediaFormat f27015b;

        /* renamed from: c */
        public final p088f4.C2003e0 f27016c;

        /* renamed from: d */
        public final android.view.Surface f27017d;

        /* renamed from: e */
        public final android.media.MediaCrypto f27018e;

        public a(p406x4.C6939m r1, android.media.MediaFormat r2, p088f4.C2003e0 r3, android.view.Surface r4, android.media.MediaCrypto r5, int r6, boolean r7) {
                r0 = this;
                r0.<init>()
                r0.f27014a = r1
                r0.f27015b = r2
                r0.f27016c = r3
                r0.f27017d = r4
                r0.f27018e = r5
                return
        }
    }

    /* renamed from: x4.k$b */
    public interface b {
        /* renamed from: a */
        p406x4.InterfaceC6937k mo14046a(p406x4.InterfaceC6937k.a r1);
    }

    /* renamed from: x4.k$c */
    public interface c {
    }

    /* renamed from: a */
    int mo14031a(android.media.MediaCodec.BufferInfo r1);

    /* renamed from: b */
    boolean mo14032b();

    /* renamed from: c */
    void mo14033c(int r1, boolean r2);

    /* renamed from: d */
    void mo14034d(int r1);

    /* renamed from: e */
    android.media.MediaFormat mo14035e();

    /* renamed from: f */
    java.nio.ByteBuffer mo14036f(int r1);

    void flush();

    /* renamed from: g */
    void mo14037g(android.view.Surface r1);

    /* renamed from: h */
    void mo14038h(int r1, int r2, int r3, long r4, int r6);

    /* renamed from: i */
    void mo14039i(android.os.Bundle r1);

    /* renamed from: j */
    void mo14040j(p406x4.InterfaceC6937k.c r1, android.os.Handler r2);

    /* renamed from: k */
    java.nio.ByteBuffer mo14041k(int r1);

    /* renamed from: l */
    void mo14042l(int r1, int r2, p142i4.C3069c r3, long r4, int r6);

    /* renamed from: m */
    void mo14043m(int r1, long r2);

    /* renamed from: n */
    int mo14044n();

    void release();
}
