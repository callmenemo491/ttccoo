package p288q8;

/* renamed from: q8.a */
/* loaded from: classes.dex */
public final class C5597a extends p124h7.AbstractC2951xf {

    /* renamed from: b */
    public final android.graphics.Typeface f21743b;

    /* renamed from: c */
    public final p288q8.C5597a.a f21744c;

    /* renamed from: d */
    public boolean f21745d;

    /* renamed from: q8.a$a */
    public interface a {
    }

    public C5597a(p288q8.C5597a.a r2, android.graphics.Typeface r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r0)
            r1.f21743b = r3
            r1.f21744c = r2
            return
    }

    @Override // p124h7.AbstractC2951xf
    /* renamed from: a */
    public void mo3339a(int r1) {
            r0 = this;
            android.graphics.Typeface r1 = r0.f21743b
            r0.m11871e(r1)
            return
    }

    @Override // p124h7.AbstractC2951xf
    /* renamed from: b */
    public void mo3340b(android.graphics.Typeface r1, boolean r2) {
            r0 = this;
            r0.m11871e(r1)
            return
    }

    /* renamed from: e */
    public final void m11871e(android.graphics.Typeface r4) {
            r3 = this;
            boolean r0 = r3.f21745d
            if (r0 != 0) goto L1e
            q8.a$a r0 = r3.f21744c
            m8.b r0 = (p220m8.C4418b) r0
            m8.c r0 = r0.f17994a
            q8.a r1 = r0.f18036w
            r2 = 1
            if (r1 == 0) goto L11
            r1.f21745d = r2
        L11:
            android.graphics.Typeface r1 = r0.f18033t
            if (r1 == r4) goto L18
            r0.f18033t = r4
            goto L19
        L18:
            r2 = 0
        L19:
            if (r2 == 0) goto L1e
            r0.m9862k()
        L1e:
            return
    }
}
