package p425y2;

/* renamed from: y2.a */
/* loaded from: classes.dex */
public class C7104a implements p425y2.InterfaceC7105b<android.graphics.Bitmap, byte[]> {

    /* renamed from: Y */
    public final android.graphics.Bitmap.CompressFormat f27495Y;

    /* renamed from: Z */
    public final int f27496Z;

    public C7104a() {
            r1 = this;
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG
            r1.<init>()
            r1.f27495Y = r0
            r0 = 100
            r1.f27496Z = r0
            return
    }

    @Override // p425y2.InterfaceC7105b
    /* renamed from: g */
    public p214m2.InterfaceC4345w<byte[]> mo1272g(p214m2.InterfaceC4345w<android.graphics.Bitmap> r4, p180k2.C3673e r5) {
            r3 = this;
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream
            r5.<init>()
            java.lang.Object r0 = r4.get()
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            android.graphics.Bitmap$CompressFormat r1 = r3.f27495Y
            int r2 = r3.f27496Z
            r0.compress(r1, r2, r5)
            r4.mo9721d()
            u2.b r4 = new u2.b
            byte[] r5 = r5.toByteArray()
            r4.<init>(r5)
            return r4
    }
}
