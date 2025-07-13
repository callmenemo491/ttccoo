package p145i7;

/* renamed from: i7.t */
/* loaded from: classes.dex */
public final class C3111t extends java.io.OutputStream {

    /* renamed from: Y */
    public long f12500Y;

    public C3111t() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.f12500Y = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(int r5) {
            r4 = this;
            long r0 = r4.f12500Y
            r2 = 1
            long r0 = r0 + r2
            r4.f12500Y = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r5) {
            r4 = this;
            long r0 = r4.f12500Y
            int r5 = r5.length
            long r2 = (long) r5
            long r0 = r0 + r2
            r4.f12500Y = r0
            return
    }

    @Override // java.io.OutputStream
    public final void write(byte[] r3, int r4, int r5) {
            r2 = this;
            if (r4 < 0) goto L13
            int r3 = r3.length
            if (r4 > r3) goto L13
            if (r5 < 0) goto L13
            int r4 = r4 + r5
            if (r4 > r3) goto L13
            if (r4 < 0) goto L13
            long r3 = r2.f12500Y
            long r0 = (long) r5
            long r3 = r3 + r0
            r2.f12500Y = r3
            return
        L13:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }
}
