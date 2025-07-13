package p322s2;

/* renamed from: s2.a */
/* loaded from: classes.dex */
public abstract class AbstractC5945a<T> implements p180k2.InterfaceC3674f<android.graphics.ImageDecoder.Source, T> {

    /* renamed from: a */
    public final p334t2.C6139q f22822a;

    /* renamed from: s2.a$a */
    public class a implements android.graphics.ImageDecoder.OnHeaderDecodedListener {

        /* renamed from: a */
        public final /* synthetic */ int f22823a;

        /* renamed from: b */
        public final /* synthetic */ int f22824b;

        /* renamed from: c */
        public final /* synthetic */ boolean f22825c;

        /* renamed from: d */
        public final /* synthetic */ com.bumptech.glide.load.EnumC1009b f22826d;

        /* renamed from: e */
        public final /* synthetic */ p334t2.AbstractC6133k f22827e;

        /* renamed from: f */
        public final /* synthetic */ com.bumptech.glide.load.EnumC1027e f22828f;

        /* renamed from: g */
        public final /* synthetic */ p322s2.AbstractC5945a f22829g;

        /* renamed from: s2.a$a$a, reason: collision with other inner class name */
        public class C7421a implements android.graphics.ImageDecoder.OnPartialImageListener {
            public C7421a(p322s2.AbstractC5945a.a r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public boolean onPartialImage(android.graphics.ImageDecoder.DecodeException r1) {
                    r0 = this;
                    r1 = 0
                    return r1
            }
        }

        public a(p322s2.AbstractC5945a r1, int r2, int r3, boolean r4, com.bumptech.glide.load.EnumC1009b r5, p334t2.AbstractC6133k r6, com.bumptech.glide.load.EnumC1027e r7) {
                r0 = this;
                r0.f22829g = r1
                r0.f22823a = r2
                r0.f22824b = r3
                r0.f22825c = r4
                r0.f22826d = r5
                r0.f22827e = r6
                r0.f22828f = r7
                r0.<init>()
                return
        }

        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
        @android.annotation.SuppressLint({"Override"})
        public void onHeaderDecoded(android.graphics.ImageDecoder r8, android.graphics.ImageDecoder.ImageInfo r9, android.graphics.ImageDecoder.Source r10) {
                r7 = this;
                s2.a r10 = r7.f22829g
                t2.q r10 = r10.f22822a
                int r0 = r7.f22823a
                int r1 = r7.f22824b
                boolean r2 = r7.f22825c
                r3 = 0
                boolean r10 = r10.m12683b(r0, r1, r2, r3)
                r0 = 1
                if (r10 == 0) goto L17
                r10 = 3
                r8.setAllocator(r10)
                goto L1a
            L17:
                r8.setAllocator(r0)
            L1a:
                com.bumptech.glide.load.b r10 = r7.f22826d
                com.bumptech.glide.load.b r0 = com.bumptech.glide.load.EnumC1009b.f5187Z
                if (r10 != r0) goto L23
                r8.setMemorySizePolicy(r3)
            L23:
                s2.a$a$a r10 = new s2.a$a$a
                r10.<init>(r7)
                r8.setOnPartialImageListener(r10)
                android.util.Size r10 = r9.getSize()
                int r0 = r7.f22823a
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 != r1) goto L39
                int r0 = r10.getWidth()
            L39:
                int r2 = r7.f22824b
                if (r2 != r1) goto L41
                int r2 = r10.getHeight()
            L41:
                t2.k r1 = r7.f22827e
                int r4 = r10.getWidth()
                int r5 = r10.getHeight()
                float r0 = r1.mo12666b(r4, r5, r0, r2)
                int r1 = r10.getWidth()
                float r1 = (float) r1
                float r1 = r1 * r0
                int r1 = java.lang.Math.round(r1)
                int r2 = r10.getHeight()
                float r2 = (float) r2
                float r2 = r2 * r0
                int r2 = java.lang.Math.round(r2)
                r4 = 2
                java.lang.String r5 = "ImageDecoder"
                boolean r4 = android.util.Log.isLoggable(r5, r4)
                if (r4 == 0) goto La4
                java.lang.String r4 = "Resizing from ["
                java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
                int r6 = r10.getWidth()
                r4.append(r6)
                java.lang.String r6 = "x"
                r4.append(r6)
                int r10 = r10.getHeight()
                r4.append(r10)
                java.lang.String r10 = "] to ["
                r4.append(r10)
                r4.append(r1)
                r4.append(r6)
                r4.append(r2)
                java.lang.String r10 = "] scaleFactor: "
                r4.append(r10)
                r4.append(r0)
                java.lang.String r10 = r4.toString()
                android.util.Log.v(r5, r10)
            La4:
                r8.setTargetSize(r1, r2)
                int r10 = android.os.Build.VERSION.SDK_INT
                r0 = 28
                if (r10 < r0) goto Lc9
                com.bumptech.glide.load.e r10 = r7.f22828f
                com.bumptech.glide.load.e r0 = com.bumptech.glide.load.EnumC1027e.f5222Z
                if (r10 != r0) goto Lc4
                android.graphics.ColorSpace r10 = r9.getColorSpace()
                if (r10 == 0) goto Lc4
                android.graphics.ColorSpace r9 = r9.getColorSpace()
                boolean r9 = r9.isWideGamut()
                if (r9 == 0) goto Lc4
                r3 = 1
            Lc4:
                if (r3 == 0) goto Lcd
                android.graphics.ColorSpace$Named r9 = android.graphics.ColorSpace.Named.DISPLAY_P3
                goto Lcf
            Lc9:
                r9 = 26
                if (r10 < r9) goto Ld6
            Lcd:
                android.graphics.ColorSpace$Named r9 = android.graphics.ColorSpace.Named.SRGB
            Lcf:
                android.graphics.ColorSpace r9 = android.graphics.ColorSpace.get(r9)
                r8.setTargetColorSpace(r9)
            Ld6:
                return
        }
    }

    public AbstractC5945a() {
            r1 = this;
            r1.<init>()
            t2.q r0 = p334t2.C6139q.m12682a()
            r1.f22822a = r0
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public /* bridge */ /* synthetic */ p214m2.InterfaceC4345w mo8132a(android.graphics.ImageDecoder.Source r1, int r2, int r3, p180k2.C3673e r4) {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = (android.graphics.ImageDecoder.Source) r1
            m2.w r1 = r0.m12355c(r1, r2, r3, r4)
            return r1
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public /* bridge */ /* synthetic */ boolean mo8133b(android.graphics.ImageDecoder.Source r1, p180k2.C3673e r2) {
            r0 = this;
            android.graphics.ImageDecoder$Source r1 = (android.graphics.ImageDecoder.Source) r1
            r1 = 1
            return r1
    }

    /* renamed from: c */
    public final p214m2.InterfaceC4345w<T> m12355c(android.graphics.ImageDecoder.Source r10, int r11, int r12, p180k2.C3673e r13) {
            r9 = this;
            k2.d<com.bumptech.glide.load.b> r0 = p334t2.C6134l.f23682f
            java.lang.Object r0 = r13.m8130c(r0)
            r6 = r0
            com.bumptech.glide.load.b r6 = (com.bumptech.glide.load.EnumC1009b) r6
            k2.d<t2.k> r0 = p334t2.AbstractC6133k.f23680f
            java.lang.Object r0 = r13.m8130c(r0)
            r7 = r0
            t2.k r7 = (p334t2.AbstractC6133k) r7
            k2.d<java.lang.Boolean> r0 = p334t2.C6134l.f23685i
            java.lang.Object r1 = r13.m8130c(r0)
            if (r1 == 0) goto L29
            java.lang.Object r0 = r13.m8130c(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L29
            r0 = 1
            r5 = 1
            goto L2b
        L29:
            r0 = 0
            r5 = 0
        L2b:
            k2.d<com.bumptech.glide.load.e> r0 = p334t2.C6134l.f23683g
            java.lang.Object r13 = r13.m8130c(r0)
            r8 = r13
            com.bumptech.glide.load.e r8 = (com.bumptech.glide.load.EnumC1027e) r8
            s2.a$a r13 = new s2.a$a
            r1 = r13
            r2 = r9
            r3 = r11
            r4 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0 = r9
            t2.c r0 = (p334t2.C6125c) r0
            android.graphics.Bitmap r10 = android.graphics.ImageDecoder.decodeBitmap(r10, r13)
            java.lang.String r13 = "BitmapImageDecoder"
            r1 = 2
            boolean r1 = android.util.Log.isLoggable(r13, r1)
            if (r1 == 0) goto L80
            java.lang.String r1 = "Decoded ["
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            int r2 = r10.getWidth()
            r1.append(r2)
            java.lang.String r2 = "x"
            r1.append(r2)
            int r3 = r10.getHeight()
            r1.append(r3)
            java.lang.String r3 = "] for ["
            r1.append(r3)
            r1.append(r11)
            r1.append(r2)
            r1.append(r12)
            java.lang.String r11 = "]"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            android.util.Log.v(r13, r11)
        L80:
            t2.d r11 = new t2.d
            n2.c r12 = r0.f23661b
            r11.<init>(r10, r12)
            return r11
    }
}
