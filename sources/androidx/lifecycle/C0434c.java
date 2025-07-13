package androidx.lifecycle;

@p134hh.InterfaceC3044e(m7451c = "androidx.lifecycle.BlockRunner$cancel$1", m7452f = "CoroutineLiveData.kt", m7453l = {187}, m7454m = "invokeSuspend")
/* renamed from: androidx.lifecycle.c */
/* loaded from: classes.dex */
public final class C0434c extends p134hh.AbstractC3048i implements mh.InterfaceC4624p<p379vh.InterfaceC6686b0, p101fh.InterfaceC2172d<? super ch.C0985l>, java.lang.Object> {

    /* renamed from: c0 */
    public int f2476c0;

    /* renamed from: d0 */
    public final /* synthetic */ androidx.lifecycle.C0438e f2477d0;

    public C0434c(androidx.lifecycle.C0438e r1, p101fh.InterfaceC2172d r2) {
            r0 = this;
            r0.f2477d0 = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: h */
    public final p101fh.InterfaceC2172d<ch.C0985l> mo121h(java.lang.Object r2, p101fh.InterfaceC2172d<?> r3) {
            r1 = this;
            java.lang.String r2 = "completion"
            p214m2.C4339q.m9706k(r3, r2)
            androidx.lifecycle.c r2 = new androidx.lifecycle.c
            androidx.lifecycle.e r0 = r1.f2477d0
            r2.<init>(r0, r3)
            return r2
    }

    @Override // mh.InterfaceC4624p
    /* renamed from: l */
    public final java.lang.Object mo122l(p379vh.InterfaceC6686b0 r2, p101fh.InterfaceC2172d<? super ch.C0985l> r3) {
            r1 = this;
            fh.d r3 = (p101fh.InterfaceC2172d) r3
            java.lang.String r2 = "completion"
            p214m2.C4339q.m9706k(r3, r2)
            androidx.lifecycle.c r2 = new androidx.lifecycle.c
            androidx.lifecycle.e r0 = r1.f2477d0
            r2.<init>(r0, r3)
            ch.l r3 = ch.C0985l.f5061a
            java.lang.Object r2 = r2.mo123o(r3)
            return r2
    }

    @Override // p134hh.AbstractC3040a
    /* renamed from: o */
    public final java.lang.Object mo123o(java.lang.Object r6) {
            r5 = this;
            gh.a r0 = gh.EnumC2389a.f10764Y
            int r1 = r5.f2476c0
            r2 = 1
            if (r1 == 0) goto L15
            if (r1 != r2) goto Ld
            p074e9.C1805a.m4540y(r6)
            goto L25
        Ld:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L15:
            p074e9.C1805a.m4540y(r6)
            androidx.lifecycle.e r6 = r5.f2477d0
            long r3 = r6.f2486e
            r5.f2476c0 = r2
            java.lang.Object r6 = p074e9.C1805a.m4523h(r3, r5)
            if (r6 != r0) goto L25
            return r0
        L25:
            androidx.lifecycle.e r6 = r5.f2477d0
            androidx.lifecycle.h<T> r6 = r6.f2484c
            boolean r6 = r6.m1412e()
            if (r6 != 0) goto L3d
            androidx.lifecycle.e r6 = r5.f2477d0
            vh.b1 r6 = r6.f2482a
            r0 = 0
            if (r6 == 0) goto L39
            r6.mo13553d0(r0)
        L39:
            androidx.lifecycle.e r6 = r5.f2477d0
            r6.f2482a = r0
        L3d:
            ch.l r6 = ch.C0985l.f5061a
            return r6
    }
}
