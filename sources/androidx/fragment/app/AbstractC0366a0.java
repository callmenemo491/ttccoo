package androidx.fragment.app;

/* renamed from: androidx.fragment.app.a0 */
/* loaded from: classes.dex */
public abstract class AbstractC0366a0<E> extends androidx.fragment.app.AbstractC0415x {

    /* renamed from: Y */
    public final android.app.Activity f2033Y;

    /* renamed from: Z */
    public final android.content.Context f2034Z;

    /* renamed from: a0 */
    public final android.os.Handler f2035a0;

    /* renamed from: b0 */
    public final androidx.fragment.app.AbstractC0375d0 f2036b0;

    public AbstractC0366a0(androidx.fragment.app.ActivityC0405s r3) {
            r2 = this;
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r2.<init>()
            androidx.fragment.app.e0 r1 = new androidx.fragment.app.e0
            r1.<init>()
            r2.f2036b0 = r1
            r2.f2033Y = r3
            java.lang.String r1 = "context == null"
            p064e.C1487a.m4027e(r3, r1)
            r2.f2034Z = r3
            r2.f2035a0 = r0
            return
    }

    /* renamed from: g */
    public abstract E mo1088g();

    /* renamed from: h */
    public abstract android.view.LayoutInflater mo1089h();

    /* renamed from: i */
    public abstract boolean mo1090i(androidx.fragment.app.ComponentCallbacksC0395n r1);

    /* renamed from: j */
    public abstract void mo1091j();
}
