package p352u5;

/* renamed from: u5.x */
/* loaded from: classes.dex */
public final class C6335x extends p352u5.C6334w {
    public C6335x(java.lang.String r3, p352u5.C6323l r4) {
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "Invalid content type: "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            r0 = 2003(0x7d3, float:2.807E-42)
            r1 = 1
            r2.<init>(r3, r4, r0, r1)
            return
    }
}
