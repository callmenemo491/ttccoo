package p334t2;

/* renamed from: t2.f */
/* loaded from: classes.dex */
public class C6128f implements p180k2.InterfaceC3674f<java.nio.ByteBuffer, android.graphics.Bitmap> {

    /* renamed from: a */
    public final /* synthetic */ int f23665a;

    /* renamed from: b */
    public final java.lang.Object f23666b;

    public C6128f(p229n2.InterfaceC4673c r2) {
            r1 = this;
            r0 = 2
            r1.f23665a = r0
            r1.<init>()
            r1.f23666b = r2
            return
    }

    public C6128f(p334t2.C6134l r2, int r3) {
            r1 = this;
            r1.f23665a = r3
            r0 = 1
            if (r3 == r0) goto Lb
            r1.<init>()
            r1.f23666b = r2
            return
        Lb:
            r1.<init>()
            r1.f23666b = r2
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.Bitmap> mo8132a(java.nio.ByteBuffer r8, int r9, int r10, p180k2.C3673e r11) {
            r7 = this;
            int r0 = r7.f23665a
            switch(r0) {
                case 0: goto L20;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L38
        L6:
            android.os.ParcelFileDescriptor r8 = (android.os.ParcelFileDescriptor) r8
            java.lang.Object r0 = r7.f23666b
            r1 = r0
            t2.l r1 = (p334t2.C6134l) r1
            t2.r$b r2 = new t2.r$b
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r1.f23692d
            n2.b r3 = r1.f23691c
            r2.<init>(r8, r0, r3)
            t2.l$b r6 = p334t2.C6134l.f23687k
            r3 = r9
            r4 = r10
            r5 = r11
            m2.w r8 = r1.m12677b(r2, r3, r4, r5, r6)
            return r8
        L20:
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            java.util.concurrent.atomic.AtomicReference<byte[]> r0 = p106g3.C2229a.f10188a
            g3.a$a r2 = new g3.a$a
            r2.<init>(r8)
            java.lang.Object r8 = r7.f23666b
            r1 = r8
            t2.l r1 = (p334t2.C6134l) r1
            t2.l$b r6 = p334t2.C6134l.f23687k
            r3 = r9
            r4 = r10
            r5 = r11
            m2.w r8 = r1.m12676a(r2, r3, r4, r5, r6)
            return r8
        L38:
            j2.a r8 = (p160j2.InterfaceC3388a) r8
            android.graphics.Bitmap r8 = r8.mo7760b()
            java.lang.Object r9 = r7.f23666b
            n2.c r9 = (p229n2.InterfaceC4673c) r9
            t2.d r8 = p334t2.C6126d.m12654f(r8, r9)
            return r8
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(java.nio.ByteBuffer r2, p180k2.C3673e r3) {
            r1 = this;
            int r3 = r1.f23665a
            r0 = 1
            switch(r3) {
                case 0: goto L11;
                case 1: goto L7;
                default: goto L6;
            }
        L6:
            goto L1b
        L7:
            android.os.ParcelFileDescriptor r2 = (android.os.ParcelFileDescriptor) r2
            java.lang.Object r2 = r1.f23666b
            t2.l r2 = (p334t2.C6134l) r2
            java.util.Objects.requireNonNull(r2)
            return r0
        L11:
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            java.lang.Object r2 = r1.f23666b
            t2.l r2 = (p334t2.C6134l) r2
            java.util.Objects.requireNonNull(r2)
            return r0
        L1b:
            j2.a r2 = (p160j2.InterfaceC3388a) r2
            return r0
    }
}
