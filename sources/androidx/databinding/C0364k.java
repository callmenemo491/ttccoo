package androidx.databinding;

/* renamed from: androidx.databinding.k */
/* loaded from: classes.dex */
public class C0364k<T> extends java.lang.ref.WeakReference<androidx.databinding.ViewDataBinding> {

    /* renamed from: a */
    public final androidx.databinding.InterfaceC0361h<T> f2021a;

    /* renamed from: b */
    public final int f2022b;

    /* renamed from: c */
    public T f2023c;

    public C0364k(androidx.databinding.ViewDataBinding r1, int r2, androidx.databinding.InterfaceC0361h<T> r3, java.lang.ref.ReferenceQueue<androidx.databinding.ViewDataBinding> r4) {
            r0 = this;
            r0.<init>(r1, r4)
            r0.f2022b = r2
            r0.f2021a = r3
            return
    }

    /* renamed from: a */
    public boolean m1071a() {
            r2 = this;
            T r0 = r2.f2023c
            if (r0 == 0) goto Lb
            androidx.databinding.h<T> r1 = r2.f2021a
            r1.mo1063a(r0)
            r0 = 1
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r1 = 0
            r2.f2023c = r1
            return r0
    }
}
