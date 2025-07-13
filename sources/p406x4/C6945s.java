package p406x4;

/* renamed from: x4.s */
/* loaded from: classes.dex */
public class C6945s implements p406x4.InterfaceC6937k {

    /* renamed from: a */
    public final android.media.MediaCodec f27112a;

    /* renamed from: b */
    public java.nio.ByteBuffer[] f27113b;

    /* renamed from: c */
    public java.nio.ByteBuffer[] f27114c;

    /* renamed from: x4.s$a */
    public static /* synthetic */ class a {
    }

    public C6945s(android.media.MediaCodec r1, android.view.Surface r2, p406x4.C6945s.a r3) {
            r0 = this;
            r0.<init>()
            r0.f27112a = r1
            int r2 = p371v5.C6552b0.f25624a
            r3 = 21
            if (r2 >= r3) goto L17
            java.nio.ByteBuffer[] r2 = r1.getInputBuffers()
            r0.f27113b = r2
            java.nio.ByteBuffer[] r1 = r1.getOutputBuffers()
            r0.f27114c = r1
        L17:
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: a */
    public int mo14031a(android.media.MediaCodec.BufferInfo r5) {
            r4 = this;
        L0:
            android.media.MediaCodec r0 = r4.f27112a
            r1 = 0
            int r0 = r0.dequeueOutputBuffer(r5, r1)
            r1 = -3
            if (r0 != r1) goto L19
            int r2 = p371v5.C6552b0.f25624a
            r3 = 21
            if (r2 >= r3) goto L19
            android.media.MediaCodec r2 = r4.f27112a
            java.nio.ByteBuffer[] r2 = r2.getOutputBuffers()
            r4.f27114c = r2
        L19:
            if (r0 == r1) goto L0
            return r0
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: b */
    public boolean mo14032b() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: c */
    public void mo14033c(int r2, boolean r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: d */
    public void mo14034d(int r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.setVideoScalingMode(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: e */
    public android.media.MediaFormat mo14035e() {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            android.media.MediaFormat r0 = r0.getOutputFormat()
            return r0
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: f */
    public java.nio.ByteBuffer mo14036f(int r3) {
            r2 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 21
            if (r0 < r1) goto Ld
            android.media.MediaCodec r0 = r2.f27112a
            java.nio.ByteBuffer r3 = r0.getInputBuffer(r3)
            return r3
        Ld:
            java.nio.ByteBuffer[] r0 = r2.f27113b
            r3 = r0[r3]
            return r3
    }

    @Override // p406x4.InterfaceC6937k
    public void flush() {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.flush()
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: g */
    public void mo14037g(android.view.Surface r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.setOutputSurface(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: h */
    public void mo14038h(int r8, int r9, int r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.f27112a
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r13
            r0.queueInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: i */
    public void mo14039i(android.os.Bundle r2) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.setParameters(r2)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: j */
    public void mo14040j(p406x4.InterfaceC6937k.c r3, android.os.Handler r4) {
            r2 = this;
            android.media.MediaCodec r0 = r2.f27112a
            x4.a r1 = new x4.a
            r1.<init>(r2, r3)
            r0.setOnFrameRenderedListener(r1, r4)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: k */
    public java.nio.ByteBuffer mo14041k(int r3) {
            r2 = this;
            int r0 = p371v5.C6552b0.f25624a
            r1 = 21
            if (r0 < r1) goto Ld
            android.media.MediaCodec r0 = r2.f27112a
            java.nio.ByteBuffer r3 = r0.getOutputBuffer(r3)
            return r3
        Ld:
            java.nio.ByteBuffer[] r0 = r2.f27114c
            r3 = r0[r3]
            return r3
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: l */
    public void mo14042l(int r8, int r9, p142i4.C3069c r10, long r11, int r13) {
            r7 = this;
            android.media.MediaCodec r0 = r7.f27112a
            android.media.MediaCodec$CryptoInfo r3 = r10.f12342i
            r1 = r8
            r2 = r9
            r4 = r11
            r6 = r13
            r0.queueSecureInputBuffer(r1, r2, r3, r4, r6)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: m */
    public void mo14043m(int r2, long r3) {
            r1 = this;
            android.media.MediaCodec r0 = r1.f27112a
            r0.releaseOutputBuffer(r2, r3)
            return
    }

    @Override // p406x4.InterfaceC6937k
    /* renamed from: n */
    public int mo14044n() {
            r3 = this;
            android.media.MediaCodec r0 = r3.f27112a
            r1 = 0
            int r0 = r0.dequeueInputBuffer(r1)
            return r0
    }

    @Override // p406x4.InterfaceC6937k
    public void release() {
            r1 = this;
            r0 = 0
            r1.f27113b = r0
            r1.f27114c = r0
            android.media.MediaCodec r0 = r1.f27112a
            r0.release()
            return
    }
}
