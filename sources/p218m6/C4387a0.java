package p218m6;

/* JADX INFO: Add missing generic type declarations: [TResult] */
/* renamed from: m6.a0 */
/* loaded from: classes.dex */
public final class C4387a0<TResult> implements p327s7.InterfaceC5980d<TResult> {

    /* renamed from: a */
    public final /* synthetic */ int f17951a;

    /* renamed from: b */
    public final java.lang.Object f17952b;

    /* renamed from: c */
    public final java.lang.Object f17953c;

    public C4387a0(p057db.AbstractServiceC1397f r2, android.content.Intent r3) {
            r1 = this;
            r0 = 1
            r1.f17951a = r0
            r1.<init>()
            r1.f17952b = r2
            r1.f17953c = r3
            return
    }

    public C4387a0(p218m6.C4413z r2, p327s7.C5986j r3) {
            r1 = this;
            r0 = 0
            r1.f17951a = r0
            r1.f17953c = r2
            r1.f17952b = r3
            r1.<init>()
            return
    }

    @Override // p327s7.InterfaceC5980d
    /* renamed from: a */
    public void mo3092a(p327s7.AbstractC5985i r2) {
            r1 = this;
            int r2 = r1.f17951a
            switch(r2) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto L14
        L6:
            java.lang.Object r2 = r1.f17953c
            m6.z r2 = (p218m6.C4413z) r2
            java.util.Map<s7.j<?>, java.lang.Boolean> r2 = r2.f17989b
            java.lang.Object r0 = r1.f17952b
            s7.j r0 = (p327s7.C5986j) r0
            r2.remove(r0)
            return
        L14:
            java.lang.Object r2 = r1.f17952b
            db.f r2 = (p057db.AbstractServiceC1397f) r2
            java.lang.Object r0 = r1.f17953c
            android.content.Intent r0 = (android.content.Intent) r0
            r2.m3917a(r0)
            return
    }
}
