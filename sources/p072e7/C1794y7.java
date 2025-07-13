package p072e7;

/* renamed from: e7.y7 */
/* loaded from: classes.dex */
public class C1794y7 extends java.lang.RuntimeException {
    public C1794y7(int r2) {
            r1 = this;
            r0 = 2
            if (r2 == r0) goto L9
            java.lang.String r2 = "Message was missing required fields.  (Lite runtime could not determine which fields were missing)."
            r1.<init>(r2)
            return
        L9:
            r1.<init>()
            return
    }

    public C1794y7(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public C1794y7(java.lang.String r1, java.lang.Throwable r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public C1794y7(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
