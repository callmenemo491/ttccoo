package p260oi;

/* renamed from: oi.f */
/* loaded from: classes.dex */
public final class C5284f extends java.io.OutputStream {

    /* renamed from: Y */
    public final /* synthetic */ p260oi.C5283e f20503Y;

    public C5284f(p260oi.C5283e r1) {
            r0 = this;
            r0.f20503Y = r1
            r0.<init>()
            return
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            return
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
            r0 = this;
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            oi.e r1 = r2.f20503Y
            r0.append(r1)
            java.lang.String r1 = ".outputStream()"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.io.OutputStream
    public void write(int r2) {
            r1 = this;
            oi.e r0 = r1.f20503Y
            r0.m11539D0(r2)
            return
    }

    @Override // java.io.OutputStream
    public void write(byte[] r2, int r3, int r4) {
            r1 = this;
            java.lang.String r0 = "data"
            p214m2.C4339q.m9706k(r2, r0)
            oi.e r0 = r1.f20503Y
            r0.m11536B0(r2, r3, r4)
            return
    }
}
