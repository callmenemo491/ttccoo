package androidx.fragment.app;

/* renamed from: androidx.fragment.app.a1 */
/* loaded from: classes.dex */
public final class C0367a1 extends java.io.Writer {

    /* renamed from: Y */
    public final java.lang.String f2037Y;

    /* renamed from: Z */
    public java.lang.StringBuilder f2038Z;

    public C0367a1(java.lang.String r3) {
            r2 = this;
            r2.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            r2.f2038Z = r0
            r2.f2037Y = r3
            return
    }

    /* renamed from: a */
    public final void m1092a() {
            r3 = this;
            java.lang.StringBuilder r0 = r3.f2038Z
            int r0 = r0.length()
            if (r0 <= 0) goto L1d
            java.lang.String r0 = r3.f2037Y
            java.lang.StringBuilder r1 = r3.f2038Z
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r0, r1)
            java.lang.StringBuilder r0 = r3.f2038Z
            r1 = 0
            int r2 = r0.length()
            r0.delete(r1, r2)
        L1d:
            return
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r0 = this;
            r0.m1092a()
            return
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
            r0 = this;
            r0.m1092a()
            return
    }

    @Override // java.io.Writer
    public void write(char[] r4, int r5, int r6) {
            r3 = this;
            r0 = 0
        L1:
            if (r0 >= r6) goto L17
            int r1 = r5 + r0
            char r1 = r4[r1]
            r2 = 10
            if (r1 != r2) goto Lf
            r3.m1092a()
            goto L14
        Lf:
            java.lang.StringBuilder r2 = r3.f2038Z
            r2.append(r1)
        L14:
            int r0 = r0 + 1
            goto L1
        L17:
            return
    }
}
