package p124h7;

/* renamed from: h7.gg */
/* loaded from: classes.dex */
public final class C2646gg extends java.io.IOException {
    public C2646gg(java.lang.String r3, java.lang.Throwable r4) {
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            r2.<init>(r3, r4)
            return
    }

    public C2646gg(java.lang.Throwable r2) {
            r1 = this;
            java.lang.String r0 = "CodedOutputStream was writing to a flat byte array and ran out of space."
            r1.<init>(r0, r2)
            return
    }
}
