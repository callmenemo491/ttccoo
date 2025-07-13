package androidx.databinding.library.baseAdapters;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends androidx.databinding.AbstractC0357d {

    /* renamed from: a */
    public static final android.util.SparseIntArray f2024a = null;

    static {
            android.util.SparseIntArray r0 = new android.util.SparseIntArray
            r1 = 0
            r0.<init>(r1)
            androidx.databinding.library.baseAdapters.DataBinderMapperImpl.f2024a = r0
            return
    }

    public DataBinderMapperImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: a */
    public java.util.List<androidx.databinding.AbstractC0357d> mo1068a() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: b */
    public androidx.databinding.ViewDataBinding mo1043b(androidx.databinding.InterfaceC0358e r1, android.view.View r2, int r3) {
            r0 = this;
            android.util.SparseIntArray r1 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.f2024a
            int r1 = r1.get(r3)
            if (r1 <= 0) goto L17
            java.lang.Object r1 = r2.getTag()
            if (r1 == 0) goto Lf
            goto L17
        Lf:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r2 = "view must have a tag"
            r1.<init>(r2)
            throw r1
        L17:
            r1 = 0
            return r1
    }

    @Override // androidx.databinding.AbstractC0357d
    /* renamed from: c */
    public androidx.databinding.ViewDataBinding mo1044c(androidx.databinding.InterfaceC0358e r2, android.view.View[] r3, int r4) {
            r1 = this;
            r2 = 0
            if (r3 == 0) goto L21
            int r0 = r3.length
            if (r0 != 0) goto L7
            goto L21
        L7:
            android.util.SparseIntArray r0 = androidx.databinding.library.baseAdapters.DataBinderMapperImpl.f2024a
            int r4 = r0.get(r4)
            if (r4 <= 0) goto L21
            r4 = 0
            r3 = r3[r4]
            java.lang.Object r3 = r3.getTag()
            if (r3 == 0) goto L19
            goto L21
        L19:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "view must have a tag"
            r2.<init>(r3)
            throw r2
        L21:
            return r2
    }
}
