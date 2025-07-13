package p352u5;

/* renamed from: u5.e */
/* loaded from: classes.dex */
public final class C6312e extends p352u5.AbstractC6310d {

    /* renamed from: e */
    public final android.content.ContentResolver f24661e;

    /* renamed from: f */
    public android.net.Uri f24662f;

    /* renamed from: g */
    public android.content.res.AssetFileDescriptor f24663g;

    /* renamed from: h */
    public java.io.FileInputStream f24664h;

    /* renamed from: i */
    public long f24665i;

    /* renamed from: j */
    public boolean f24666j;

    /* renamed from: u5.e$a */
    public static final class a {
        /* renamed from: a */
        public static void m12956a(android.os.Bundle r2) {
                android.media.ApplicationMediaCapabilities$Builder r0 = new android.media.ApplicationMediaCapabilities$Builder
                r0.<init>()
                java.lang.String r1 = "video/hevc"
                android.media.ApplicationMediaCapabilities$Builder r0 = r0.addSupportedVideoMimeType(r1)
                java.lang.String r1 = "android.media.feature.hdr.dolby_vision"
                android.media.ApplicationMediaCapabilities$Builder r0 = r0.addSupportedHdrType(r1)
                java.lang.String r1 = "android.media.feature.hdr.hdr10"
                android.media.ApplicationMediaCapabilities$Builder r0 = r0.addSupportedHdrType(r1)
                java.lang.String r1 = "android.media.feature.hdr.hdr10_plus"
                android.media.ApplicationMediaCapabilities$Builder r0 = r0.addSupportedHdrType(r1)
                java.lang.String r1 = "android.media.feature.hdr.hlg"
                android.media.ApplicationMediaCapabilities$Builder r0 = r0.addSupportedHdrType(r1)
                android.media.ApplicationMediaCapabilities r0 = r0.build()
                java.lang.String r1 = "android.provider.extra.MEDIA_CAPABILITIES"
                r2.putParcelable(r1, r0)
                return
        }
    }

    /* renamed from: u5.e$b */
    public static class b extends p352u5.C6321j {
        public b(java.io.IOException r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    public C6312e(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            android.content.ContentResolver r2 = r2.getContentResolver()
            r1.f24661e = r2
            return
    }

    @Override // p352u5.InterfaceC6314f
    /* renamed from: b */
    public int mo6020b(byte[] r8, int r9, int r10) {
            r7 = this;
            if (r10 != 0) goto L4
            r8 = 0
            return r8
        L4:
            long r0 = r7.f24665i
            r2 = 0
            r4 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto Le
            return r4
        Le:
            r2 = -1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 != 0) goto L15
            goto L1b
        L15:
            long r5 = (long) r10
            long r0 = java.lang.Math.min(r0, r5)     // Catch: java.io.IOException -> L34
            int r10 = (int) r0     // Catch: java.io.IOException -> L34
        L1b:
            java.io.FileInputStream r0 = r7.f24664h     // Catch: java.io.IOException -> L34
            int r1 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> L34
            int r8 = r0.read(r8, r9, r10)     // Catch: java.io.IOException -> L34
            if (r8 != r4) goto L26
            return r4
        L26:
            long r9 = r7.f24665i
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 == 0) goto L30
            long r0 = (long) r8
            long r9 = r9 - r0
            r7.f24665i = r9
        L30:
            r7.m12952r(r8)
            return r8
        L34:
            r8 = move-exception
            u5.e$b r9 = new u5.e$b
            r10 = 2000(0x7d0, float:2.803E-42)
            r9.<init>(r8, r10)
            throw r9
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: c */
    public long mo6021c(p352u5.C6323l r15) {
            r14 = this;
            r0 = 2000(0x7d0, float:2.803E-42)
            android.net.Uri r1 = r15.f24704a     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r14.f24662f = r1     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r14.m12954t(r15)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r2 = "content"
            android.net.Uri r3 = r15.f24704a     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r3 = r3.getScheme()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            boolean r2 = r2.equals(r3)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            if (r2 == 0) goto L2e
            android.os.Bundle r2 = new android.os.Bundle     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r2.<init>()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r3 = p371v5.C6552b0.f25624a     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r4 = 31
            if (r3 < r4) goto L25
            p352u5.C6312e.a.m12956a(r2)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        L25:
            android.content.ContentResolver r3 = r14.f24661e     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r4 = "*/*"
            android.content.res.AssetFileDescriptor r2 = r3.openTypedAssetFileDescriptor(r1, r4, r2)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            goto L36
        L2e:
            android.content.ContentResolver r2 = r14.f24661e     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r3 = "r"
            android.content.res.AssetFileDescriptor r2 = r2.openAssetFileDescriptor(r1, r3)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        L36:
            r14.f24663g = r2     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            if (r2 == 0) goto Lcc
            long r3 = r2.getLength()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.io.FileDescriptor r5 = r2.getFileDescriptor()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r1.<init>(r5)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r14.f24664h = r1     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r5 = 2008(0x7d8, float:2.814E-42)
            r6 = 0
            r7 = -1
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 == 0) goto L5f
            long r10 = r15.f24709f     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r12 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r12 > 0) goto L59
            goto L5f
        L59:
            u5.e$b r15 = new u5.e$b     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r15.<init>(r6, r5)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            throw r15     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        L5f:
            long r10 = r2.getStartOffset()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            long r12 = r15.f24709f     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            long r12 = r12 + r10
            long r12 = r1.skip(r12)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            long r12 = r12 - r10
            long r10 = r15.f24709f     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r2 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r2 != 0) goto Lc6
            r10 = 0
            if (r9 != 0) goto L96
            java.nio.channels.FileChannel r1 = r1.getChannel()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            long r2 = r1.size()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 != 0) goto L84
            r14.f24665i = r7     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            goto L9d
        L84:
            long r12 = r1.position()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            long r2 = r2 - r12
            r14.f24665i = r2     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r1 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r1 < 0) goto L90
            goto L9d
        L90:
            u5.e$b r15 = new u5.e$b     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r15.<init>(r6, r5)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            throw r15     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        L96:
            long r3 = r3 - r12
            r14.f24665i = r3     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 < 0) goto Lc0
        L9d:
            long r0 = r15.f24710g
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto Lb0
            long r2 = r14.f24665i
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto Laa
            goto Lae
        Laa:
            long r0 = java.lang.Math.min(r2, r0)
        Lae:
            r14.f24665i = r0
        Lb0:
            r0 = 1
            r14.f24666j = r0
            r14.m12955u(r15)
            long r0 = r15.f24710g
            int r15 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r15 == 0) goto Lbd
            goto Lbf
        Lbd:
            long r0 = r14.f24665i
        Lbf:
            return r0
        Lc0:
            u5.e$b r15 = new u5.e$b     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r15.<init>(r6, r5)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            throw r15     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        Lc6:
            u5.e$b r15 = new u5.e$b     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r15.<init>(r6, r5)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            throw r15     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        Lcc:
            u5.e$b r15 = new u5.e$b     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.io.IOException r2 = new java.io.IOException     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r3 = r1.length()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            int r3 = r3 + 36
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r4.<init>(r3)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r3 = "Could not open file descriptor for: "
            r4.append(r3)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r4.append(r1)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            java.lang.String r1 = r4.toString()     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r2.<init>(r1)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            r15.<init>(r2, r0)     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
            throw r15     // Catch: java.io.IOException -> Lf2 p352u5.C6312e.b -> Lff
        Lf2:
            r15 = move-exception
            u5.e$b r1 = new u5.e$b
            boolean r2 = r15 instanceof java.io.FileNotFoundException
            if (r2 == 0) goto Lfb
            r0 = 2005(0x7d5, float:2.81E-42)
        Lfb:
            r1.<init>(r15, r0)
            throw r1
        Lff:
            r15 = move-exception
            throw r15
    }

    @Override // p352u5.InterfaceC6320i
    public void close() {
            r5 = this;
            r0 = 0
            r5.f24662f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.f24664h     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            if (r3 == 0) goto Ld
            r3.close()     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
        Ld:
            r5.f24664h = r0
            android.content.res.AssetFileDescriptor r3 = r5.f24663g     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            if (r3 == 0) goto L16
            r3.close()     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
        L16:
            r5.f24663g = r0
            boolean r0 = r5.f24666j
            if (r0 == 0) goto L21
            r5.f24666j = r2
            r5.m12953s()
        L21:
            return
        L22:
            r1 = move-exception
            goto L2b
        L24:
            r3 = move-exception
            u5.e$b r4 = new u5.e$b     // Catch: java.lang.Throwable -> L22
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L22
            throw r4     // Catch: java.lang.Throwable -> L22
        L2b:
            r5.f24663g = r0
            boolean r0 = r5.f24666j
            if (r0 == 0) goto L36
            r5.f24666j = r2
            r5.m12953s()
        L36:
            throw r1
        L37:
            r3 = move-exception
            goto L40
        L39:
            r3 = move-exception
            u5.e$b r4 = new u5.e$b     // Catch: java.lang.Throwable -> L37
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L37
            throw r4     // Catch: java.lang.Throwable -> L37
        L40:
            r5.f24664h = r0
            android.content.res.AssetFileDescriptor r4 = r5.f24663g     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
            if (r4 == 0) goto L49
            r4.close()     // Catch: java.lang.Throwable -> L55 java.io.IOException -> L57
        L49:
            r5.f24663g = r0
            boolean r0 = r5.f24666j
            if (r0 == 0) goto L54
            r5.f24666j = r2
            r5.m12953s()
        L54:
            throw r3
        L55:
            r1 = move-exception
            goto L5e
        L57:
            r3 = move-exception
            u5.e$b r4 = new u5.e$b     // Catch: java.lang.Throwable -> L55
            r4.<init>(r3, r1)     // Catch: java.lang.Throwable -> L55
            throw r4     // Catch: java.lang.Throwable -> L55
        L5e:
            r5.f24663g = r0
            boolean r0 = r5.f24666j
            if (r0 == 0) goto L69
            r5.f24666j = r2
            r5.m12953s()
        L69:
            throw r1
    }

    @Override // p352u5.InterfaceC6320i
    /* renamed from: l */
    public android.net.Uri mo6024l() {
            r1 = this;
            android.net.Uri r0 = r1.f24662f
            return r0
    }
}
