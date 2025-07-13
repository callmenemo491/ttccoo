package p088f4;

/* renamed from: f4.d0 */
/* loaded from: classes.dex */
public final class C2000d0 extends java.lang.RuntimeException {
    public C2000d0(int r2) {
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L12
            r0 = 2
            if (r2 == r0) goto Lf
            r0 = 3
            if (r2 == r0) goto Lc
            java.lang.String r2 = "Undefined timeout."
            goto L14
        Lc:
            java.lang.String r2 = "Detaching surface timed out."
            goto L14
        Lf:
            java.lang.String r2 = "Setting foreground mode timed out."
            goto L14
        L12:
            java.lang.String r2 = "Player release timed out."
        L14:
            r1.<init>(r2)
            return
    }
}
