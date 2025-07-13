package p334t2;

/* renamed from: t2.a */
/* loaded from: classes.dex */
public class C6123a<DataType> implements p180k2.InterfaceC3674f<DataType, android.graphics.drawable.BitmapDrawable> {

    /* renamed from: a */
    public final /* synthetic */ int f23655a;

    /* renamed from: b */
    public final p180k2.InterfaceC3674f<DataType, android.graphics.Bitmap> f23656b;

    /* renamed from: c */
    public final java.lang.Object f23657c;

    public C6123a(android.content.res.Resources r2, p180k2.InterfaceC3674f r3) {
            r1 = this;
            r0 = 0
            r1.f23655a = r0
            r1.<init>()
            r1.f23657c = r2
            r1.f23656b = r3
            return
    }

    public C6123a(p368v2.C6495d r2, p229n2.InterfaceC4673c r3) {
            r1 = this;
            r0 = 1
            r1.f23655a = r0
            r1.<init>()
            r1.f23656b = r2
            r1.f23657c = r3
            return
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: a */
    public p214m2.InterfaceC4345w<android.graphics.drawable.BitmapDrawable> mo8132a(java.lang.Object r2, int r3, int r4, p180k2.C3673e r5) {
            r1 = this;
            int r0 = r1.f23655a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L17
        L6:
            k2.f<DataType, android.graphics.Bitmap> r0 = r1.f23656b
            k2.f r0 = (p180k2.InterfaceC3674f) r0
            m2.w r2 = r0.mo8132a(r2, r3, r4, r5)
            java.lang.Object r3 = r1.f23657c
            android.content.res.Resources r3 = (android.content.res.Resources) r3
            m2.w r2 = p334t2.C6126d.m12653e(r3, r2)
            return r2
        L17:
            android.net.Uri r2 = (android.net.Uri) r2
            k2.f<DataType, android.graphics.Bitmap> r5 = r1.f23656b
            v2.d r5 = (p368v2.C6495d) r5
            m2.w r2 = r5.m13207c(r2)
            if (r2 != 0) goto L25
            r2 = 0
            goto L35
        L25:
            v2.b r2 = (p368v2.AbstractC6493b) r2
            java.lang.Object r2 = r2.get()
            android.graphics.drawable.Drawable r2 = (android.graphics.drawable.Drawable) r2
            java.lang.Object r5 = r1.f23657c
            n2.c r5 = (p229n2.InterfaceC4673c) r5
            m2.w r2 = p334t2.C6135m.m12681a(r5, r2, r3, r4)
        L35:
            return r2
    }

    @Override // p180k2.InterfaceC3674f
    /* renamed from: b */
    public boolean mo8133b(java.lang.Object r2, p180k2.C3673e r3) {
            r1 = this;
            int r0 = r1.f23655a
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            k2.f<DataType, android.graphics.Bitmap> r0 = r1.f23656b
            k2.f r0 = (p180k2.InterfaceC3674f) r0
            boolean r2 = r0.mo8133b(r2, r3)
            return r2
        Lf:
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r2 = r2.getScheme()
            java.lang.String r3 = "android.resource"
            boolean r2 = r3.equals(r2)
            return r2
    }
}
