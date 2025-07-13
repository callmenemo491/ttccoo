package p057db;

/* renamed from: db.t */
/* loaded from: classes.dex */
public final /* synthetic */ class C1419t implements p335t3.InterfaceC6152e {

    /* renamed from: Y */
    public static final p335t3.InterfaceC6152e f7094Y = null;

    static {
            db.t r0 = new db.t
            r0.<init>()
            p057db.C1419t.f7094Y = r0
            return
    }

    public C1419t() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // p335t3.InterfaceC6152e
    public java.lang.Object apply(java.lang.Object r3) {
            r2 = this;
            eb.b r3 = (p076eb.C1812b) r3
            java.util.Objects.requireNonNull(r3)
            androidx.fragment.app.l0 r0 = p145i7.AbstractC3100i.f12490a
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r0.m1267Y(r3, r1)     // Catch: java.io.IOException -> Lf
        Lf:
            byte[] r3 = r1.toByteArray()
            return r3
    }
}
