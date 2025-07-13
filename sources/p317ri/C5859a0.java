package p317ri;

/* renamed from: ri.a0 */
/* loaded from: classes.dex */
public class C5859a0 extends p317ri.AbstractC5858a {
    public C5859a0(int r6, p124h7.C2839rb r7) {
            r5 = this;
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            r2 = 0
        L7:
            int r3 = r7.m7098u()
            if (r2 == r3) goto L37
            ri.e r3 = r7.m7093n(r2)     // Catch: java.io.IOException -> L1f
            ri.m r3 = (p317ri.AbstractC5894m) r3     // Catch: java.io.IOException -> L1f
            java.lang.String r4 = "BER"
            byte[] r3 = r3.m12246m(r4)     // Catch: java.io.IOException -> L1f
            r0.write(r3)     // Catch: java.io.IOException -> L1f
            int r2 = r2 + 1
            goto L7
        L1f:
            r6 = move-exception
            ri.r r7 = new ri.r
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "malformed object: "
            r0.append(r2)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0, r6, r1)
            throw r7
        L37:
            byte[] r7 = r0.toByteArray()
            r0 = 1
            r5.<init>(r0, r6, r7)
            return
    }

    @Override // p317ri.AbstractC5858a, p317ri.AbstractC5912s
    /* renamed from: p */
    public void mo12204p(p317ri.C5906q r3) {
            r2 = this;
            boolean r0 = r2.f22663Y
            if (r0 == 0) goto L7
            r0 = 96
            goto L9
        L7:
            r0 = 64
        L9:
            int r1 = r2.f22664Z
            r3.m12269i(r0, r1)
            r0 = 128(0x80, float:1.8E-43)
            r3.mo12264c(r0)
            byte[] r0 = r2.f22665a0
            java.io.OutputStream r1 = r3.f22730a
            r1.write(r0)
            r0 = 0
            r3.mo12264c(r0)
            r3.mo12264c(r0)
            return
    }
}
