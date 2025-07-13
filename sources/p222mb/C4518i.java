package p222mb;

/* renamed from: mb.i */
/* loaded from: classes.dex */
public class C4518i extends p222mb.C4519j.b {

    /* renamed from: d */
    public final /* synthetic */ java.lang.reflect.Field f18342d;

    /* renamed from: e */
    public final /* synthetic */ boolean f18343e;

    /* renamed from: f */
    public final /* synthetic */ p169jb.AbstractC3483z f18344f;

    /* renamed from: g */
    public final /* synthetic */ p169jb.C3467j f18345g;

    /* renamed from: h */
    public final /* synthetic */ p274pb.C5380a f18346h;

    /* renamed from: i */
    public final /* synthetic */ boolean f18347i;

    public C4518i(p222mb.C4519j r1, java.lang.String r2, boolean r3, boolean r4, java.lang.reflect.Field r5, boolean r6, p169jb.AbstractC3483z r7, p169jb.C3467j r8, p274pb.C5380a r9, boolean r10) {
            r0 = this;
            r0.f18342d = r5
            r0.f18343e = r6
            r0.f18344f = r7
            r0.f18345g = r8
            r0.f18346h = r9
            r0.f18347i = r10
            r0.<init>(r2, r3, r4)
            return
    }

    @Override // p222mb.C4519j.b
    /* renamed from: a */
    public void mo10428a(p290qb.C5612a r2, java.lang.Object r3) {
            r1 = this;
            jb.z r0 = r1.f18344f
            java.lang.Object r2 = r0.mo7919a(r2)
            if (r2 != 0) goto Lc
            boolean r0 = r1.f18347i
            if (r0 != 0) goto L11
        Lc:
            java.lang.reflect.Field r0 = r1.f18342d
            r0.set(r3, r2)
        L11:
            return
    }

    @Override // p222mb.C4519j.b
    /* renamed from: b */
    public void mo10429b(p290qb.C5614c r5, java.lang.Object r6) {
            r4 = this;
            java.lang.reflect.Field r0 = r4.f18342d
            java.lang.Object r6 = r0.get(r6)
            boolean r0 = r4.f18343e
            if (r0 == 0) goto Ld
            jb.z r0 = r4.f18344f
            goto L1a
        Ld:
            mb.n r0 = new mb.n
            jb.j r1 = r4.f18345g
            jb.z r2 = r4.f18344f
            pb.a r3 = r4.f18346h
            java.lang.reflect.Type r3 = r3.f21382b
            r0.<init>(r1, r2, r3)
        L1a:
            r0.mo7920b(r5, r6)
            return
    }

    @Override // p222mb.C4519j.b
    /* renamed from: c */
    public boolean mo10430c(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r2.f18356b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.reflect.Field r0 = r2.f18342d
            java.lang.Object r0 = r0.get(r3)
            if (r0 == r3) goto Lf
            r1 = 1
        Lf:
            return r1
    }
}
