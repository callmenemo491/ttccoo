package p334t2;

/* renamed from: t2.y */
/* loaded from: classes.dex */
public class C6147y extends android.media.MediaDataSource {

    /* renamed from: Y */
    public final /* synthetic */ java.nio.ByteBuffer f23737Y;

    public C6147y(p334t2.C6146x.d r1, java.nio.ByteBuffer r2) {
            r0 = this;
            r0.f23737Y = r2
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // android.media.MediaDataSource
    public long getSize() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.f23737Y
            int r0 = r0.limit()
            long r0 = (long) r0
            return r0
    }

    @Override // android.media.MediaDataSource
    public int readAt(long r4, byte[] r6, int r7, int r8) {
            r3 = this;
            java.nio.ByteBuffer r0 = r3.f23737Y
            int r0 = r0.limit()
            long r0 = (long) r0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto Ld
            r4 = -1
            return r4
        Ld:
            java.nio.ByteBuffer r0 = r3.f23737Y
            int r5 = (int) r4
            r0.position(r5)
            java.nio.ByteBuffer r4 = r3.f23737Y
            int r4 = r4.remaining()
            int r4 = java.lang.Math.min(r8, r4)
            java.nio.ByteBuffer r5 = r3.f23737Y
            r5.get(r6, r7, r4)
            return r4
    }
}
