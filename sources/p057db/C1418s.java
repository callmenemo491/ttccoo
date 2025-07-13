package p057db;

/* renamed from: db.s */
/* loaded from: classes.dex */
public class C1418s implements java.io.Closeable {

    /* renamed from: Y */
    public final java.net.URL f7091Y;

    /* renamed from: Z */
    public p327s7.AbstractC5985i<android.graphics.Bitmap> f7092Z;

    /* renamed from: a0 */
    public volatile java.io.InputStream f7093a0;

    public C1418s(java.net.URL r1) {
            r0 = this;
            r0.<init>()
            r0.f7091Y = r1
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r7 = this;
            java.io.InputStream r0 = r7.f7093a0     // Catch: java.lang.NullPointerException -> L21
            java.util.logging.Logger r1 = p145i7.C3104m.f12494a     // Catch: java.lang.NullPointerException -> L21
            if (r0 != 0) goto L7
            goto L19
        L7:
            r0.close()     // Catch: java.io.IOException -> Lb java.lang.NullPointerException -> L21
            goto L19
        Lb:
            r6 = move-exception
            java.util.logging.Logger r1 = p145i7.C3104m.f12494a     // Catch: java.io.IOException -> L1a java.lang.NullPointerException -> L21
            java.util.logging.Level r2 = java.util.logging.Level.WARNING     // Catch: java.io.IOException -> L1a java.lang.NullPointerException -> L21
            java.lang.String r3 = "com.google.common.io.Closeables"
            java.lang.String r4 = "close"
            java.lang.String r5 = "IOException thrown while closing Closeable."
            r1.logp(r2, r3, r4, r5, r6)     // Catch: java.io.IOException -> L1a java.lang.NullPointerException -> L21
        L19:
            return
        L1a:
            r0 = move-exception
            java.lang.AssertionError r1 = new java.lang.AssertionError     // Catch: java.lang.NullPointerException -> L21
            r1.<init>(r0)     // Catch: java.lang.NullPointerException -> L21
            throw r1     // Catch: java.lang.NullPointerException -> L21
        L21:
            r0 = move-exception
            java.lang.String r1 = "FirebaseMessaging"
            java.lang.String r2 = "Failed to close the image download stream."
            android.util.Log.e(r1, r2, r0)
            return
    }
}
