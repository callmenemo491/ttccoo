package ai;

/* renamed from: ai.b */
/* loaded from: classes.dex */
public final class C0102b extends ai.C0103c {

    /* renamed from: e0 */
    public static final ai.C0102b f354e0 = null;

    /* renamed from: f0 */
    public static final p379vh.AbstractC6755z f355f0 = null;

    static {
            ai.b r0 = new ai.b
            r0.<init>()
            ai.C0102b.f354e0 = r0
            ai.e r1 = new ai.e
            int r2 = p459zh.C7351q.f28110a
            r3 = 64
            if (r3 >= r2) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = 64
        L13:
            r6 = 0
            r7 = 0
            r8 = 12
            r9 = 0
            java.lang.String r4 = "kotlinx.coroutines.io.parallelism"
            int r2 = p074e9.C1805a.m4537v(r4, r5, r6, r7, r8, r9)
            r3 = 1
            java.lang.String r4 = "Dispatchers.IO"
            r1.<init>(r0, r2, r4, r3)
            ai.C0102b.f355f0 = r1
            return
    }

    public C0102b() {
            r3 = this;
            r0 = 0
            r1 = 0
            r2 = 7
            r3.<init>(r0, r0, r1, r2)
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // p379vh.AbstractC6755z
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}
