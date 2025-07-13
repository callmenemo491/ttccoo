package p124h7;

/* renamed from: h7.u0 */
/* loaded from: classes.dex */
public class C2882u0 extends java.lang.RuntimeException {
    public C2882u0(int r2) {
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

    public C2882u0(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }
}
