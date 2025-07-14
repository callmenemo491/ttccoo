package p191kd;

/* renamed from: kd.a */
/* loaded from: classes.dex */
public final class C4096a implements p347u0.C6282f.d {

    /* renamed from: a */
    public final p191kd.C4096a.a f17020a;

    /* renamed from: b */
    public final int f17021b;

    /* renamed from: kd.a$a */
    public interface a {
        /* renamed from: a */
        void mo7970a(int r1, java.lang.CharSequence r2, int r3, int r4, int r5);
    }

    public C4096a(p191kd.C4096a.a r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.f17020a = r1
            r0.f17021b = r2
            return
    }

    @Override // p347u0.C6282f.d
    public void onTextChanged(java.lang.CharSequence r7, int r8, int r9, int r10) {
            r6 = this;
            kd.a$a r0 = r6.f17020a
            int r1 = r6.f17021b
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.mo7970a(r1, r2, r3, r4, r5)
            return
    }
}
