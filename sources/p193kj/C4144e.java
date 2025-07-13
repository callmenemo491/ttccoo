package p193kj;

/* renamed from: kj.e */
/* loaded from: classes.dex */
public class C4144e {

    /* renamed from: a */
    public byte[] f17173a;

    /* renamed from: b */
    public int f17174b;

    public C4144e(byte[] r1, int r2) {
            r0 = this;
            r0.<init>()
            byte[] r1 = p400wj.C6888a.m13951c(r1)
            r0.f17173a = r1
            r0.f17174b = r2
            return
    }

    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof p193kj.C4144e
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kj.e r4 = (p193kj.C4144e) r4
            int r0 = r4.f17174b
            int r2 = r3.f17174b
            if (r0 == r2) goto Lf
            return r1
        Lf:
            byte[] r0 = r3.f17173a
            byte[] r4 = r4.f17173a
            boolean r4 = p400wj.C6888a.m13949a(r0, r4)
            return r4
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f17174b
            byte[] r1 = r2.f17173a
            int r1 = p400wj.C6888a.m13952d(r1)
            r0 = r0 ^ r1
            return r0
    }
}
