package p084f0;

/* renamed from: f0.j */
/* loaded from: classes.dex */
public class C1947j extends p084f0.C1948k {
    public C1947j() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p084f0.C1948k
    /* renamed from: a */
    public android.graphics.Typeface mo4842a(android.content.Context r9, p065e0.C1501f.b r10, android.content.res.Resources r11, int r12) {
            r8 = this;
            r9 = 0
            e0.f$c[] r10 = r10.f7301a     // Catch: java.lang.Exception -> L69
            int r0 = r10.length     // Catch: java.lang.Exception -> L69
            r1 = 0
            r3 = r9
            r2 = 0
        L7:
            r4 = 1
            if (r2 >= r0) goto L42
            r5 = r10[r2]     // Catch: java.lang.Exception -> L69
            android.graphics.fonts.Font$Builder r6 = new android.graphics.fonts.Font$Builder     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            int r7 = r5.f7307f     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            r6.<init>(r11, r7)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            int r7 = r5.f7303b     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            android.graphics.fonts.Font$Builder r6 = r6.setWeight(r7)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            boolean r7 = r5.f7304c     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            if (r7 == 0) goto L1e
            goto L1f
        L1e:
            r4 = 0
        L1f:
            android.graphics.fonts.Font$Builder r4 = r6.setSlant(r4)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            int r6 = r5.f7306e     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            android.graphics.fonts.Font$Builder r4 = r4.setTtcIndex(r6)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            java.lang.String r5 = r5.f7305d     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            android.graphics.fonts.Font$Builder r4 = r4.setFontVariationSettings(r5)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            android.graphics.fonts.Font r4 = r4.build()     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            if (r3 != 0) goto L3c
            android.graphics.fonts.FontFamily$Builder r5 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            r5.<init>(r4)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
            r3 = r5
            goto L3f
        L3c:
            r3.addFont(r4)     // Catch: java.io.IOException -> L3f java.lang.Exception -> L69
        L3f:
            int r2 = r2 + 1
            goto L7
        L42:
            if (r3 != 0) goto L45
            return r9
        L45:
            android.graphics.fonts.FontStyle r10 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L69
            r11 = r12 & 1
            if (r11 == 0) goto L4e
            r11 = 700(0x2bc, float:9.81E-43)
            goto L50
        L4e:
            r11 = 400(0x190, float:5.6E-43)
        L50:
            r12 = r12 & 2
            if (r12 == 0) goto L55
            r1 = 1
        L55:
            r10.<init>(r11, r1)     // Catch: java.lang.Exception -> L69
            android.graphics.Typeface$CustomFallbackBuilder r11 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L69
            android.graphics.fonts.FontFamily r12 = r3.build()     // Catch: java.lang.Exception -> L69
            r11.<init>(r12)     // Catch: java.lang.Exception -> L69
            android.graphics.Typeface$CustomFallbackBuilder r10 = r11.setStyle(r10)     // Catch: java.lang.Exception -> L69
            android.graphics.Typeface r9 = r10.build()     // Catch: java.lang.Exception -> L69
        L69:
            return r9
    }

    @Override // p084f0.C1948k
    /* renamed from: b */
    public android.graphics.Typeface mo4843b(android.content.Context r11, android.os.CancellationSignal r12, p178k0.C3636l[] r13, int r14) {
            r10 = this;
            android.content.ContentResolver r11 = r11.getContentResolver()
            r0 = 0
            int r1 = r13.length     // Catch: java.lang.Exception -> L7f
            r2 = 0
            r4 = r0
            r3 = 0
        L9:
            r5 = 1
            if (r3 >= r1) goto L57
            r6 = r13[r3]     // Catch: java.lang.Exception -> L7f
            android.net.Uri r7 = r6.f16034a     // Catch: java.io.IOException -> L54 java.lang.Exception -> L7f
            java.lang.String r8 = "r"
            android.os.ParcelFileDescriptor r7 = r11.openFileDescriptor(r7, r8, r12)     // Catch: java.io.IOException -> L54 java.lang.Exception -> L7f
            if (r7 != 0) goto L1e
            if (r7 == 0) goto L54
        L1a:
            r7.close()     // Catch: java.io.IOException -> L54 java.lang.Exception -> L7f
            goto L54
        L1e:
            android.graphics.fonts.Font$Builder r8 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Throwable -> L4a
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L4a
            int r9 = r6.f16036c     // Catch: java.lang.Throwable -> L4a
            android.graphics.fonts.Font$Builder r8 = r8.setWeight(r9)     // Catch: java.lang.Throwable -> L4a
            boolean r9 = r6.f16037d     // Catch: java.lang.Throwable -> L4a
            if (r9 == 0) goto L2e
            goto L2f
        L2e:
            r5 = 0
        L2f:
            android.graphics.fonts.Font$Builder r5 = r8.setSlant(r5)     // Catch: java.lang.Throwable -> L4a
            int r6 = r6.f16035b     // Catch: java.lang.Throwable -> L4a
            android.graphics.fonts.Font$Builder r5 = r5.setTtcIndex(r6)     // Catch: java.lang.Throwable -> L4a
            android.graphics.fonts.Font r5 = r5.build()     // Catch: java.lang.Throwable -> L4a
            if (r4 != 0) goto L46
            android.graphics.fonts.FontFamily$Builder r6 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Throwable -> L4a
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L4a
            r4 = r6
            goto L1a
        L46:
            r4.addFont(r5)     // Catch: java.lang.Throwable -> L4a
            goto L1a
        L4a:
            r5 = move-exception
            r7.close()     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r6 = move-exception
            r5.addSuppressed(r6)     // Catch: java.io.IOException -> L54 java.lang.Exception -> L7f
        L53:
            throw r5     // Catch: java.io.IOException -> L54 java.lang.Exception -> L7f
        L54:
            int r3 = r3 + 1
            goto L9
        L57:
            if (r4 != 0) goto L5a
            return r0
        L5a:
            android.graphics.fonts.FontStyle r11 = new android.graphics.fonts.FontStyle     // Catch: java.lang.Exception -> L7f
            r12 = r14 & 1
            if (r12 == 0) goto L63
            r12 = 700(0x2bc, float:9.81E-43)
            goto L65
        L63:
            r12 = 400(0x190, float:5.6E-43)
        L65:
            r13 = r14 & 2
            if (r13 == 0) goto L6a
            r2 = 1
        L6a:
            r11.<init>(r12, r2)     // Catch: java.lang.Exception -> L7f
            android.graphics.Typeface$CustomFallbackBuilder r12 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L7f
            android.graphics.fonts.FontFamily r13 = r4.build()     // Catch: java.lang.Exception -> L7f
            r12.<init>(r13)     // Catch: java.lang.Exception -> L7f
            android.graphics.Typeface$CustomFallbackBuilder r11 = r12.setStyle(r11)     // Catch: java.lang.Exception -> L7f
            android.graphics.Typeface r11 = r11.build()     // Catch: java.lang.Exception -> L7f
            return r11
        L7f:
            return r0
    }

    @Override // p084f0.C1948k
    /* renamed from: c */
    public android.graphics.Typeface mo4856c(android.content.Context r1, java.io.InputStream r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }

    @Override // p084f0.C1948k
    /* renamed from: d */
    public android.graphics.Typeface mo4847d(android.content.Context r1, android.content.res.Resources r2, int r3, java.lang.String r4, int r5) {
            r0 = this;
            android.graphics.fonts.Font$Builder r1 = new android.graphics.fonts.Font$Builder     // Catch: java.lang.Exception -> L24
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.Font r1 = r1.build()     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily$Builder r2 = new android.graphics.fonts.FontFamily$Builder     // Catch: java.lang.Exception -> L24
            r2.<init>(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontFamily r2 = r2.build()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r3 = new android.graphics.Typeface$CustomFallbackBuilder     // Catch: java.lang.Exception -> L24
            r3.<init>(r2)     // Catch: java.lang.Exception -> L24
            android.graphics.fonts.FontStyle r1 = r1.getStyle()     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface$CustomFallbackBuilder r1 = r3.setStyle(r1)     // Catch: java.lang.Exception -> L24
            android.graphics.Typeface r1 = r1.build()     // Catch: java.lang.Exception -> L24
            return r1
        L24:
            r1 = 0
            return r1
    }

    @Override // p084f0.C1948k
    /* renamed from: e */
    public p178k0.C3636l mo4857e(p178k0.C3636l[] r1, int r2) {
            r0 = this;
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "Do not use this function in API 29 or later."
            r1.<init>(r2)
            throw r1
    }
}
