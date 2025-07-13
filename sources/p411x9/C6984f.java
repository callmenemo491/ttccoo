package p411x9;

/* renamed from: x9.f */
/* loaded from: classes.dex */
public final class C6984f implements android.os.Parcelable.Creator<p411x9.C6982e> {
    public C6984f() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6982e createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        La:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L57
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r8 = 1
            if (r2 == r8) goto L4f
            r8 = 2
            if (r2 == r8) goto L45
            r8 = 3
            if (r2 == r8) goto L3f
            r8 = 4
            if (r2 == r8) goto L35
            r8 = 5
            if (r2 == r8) goto L2b
            p270p6.C5368b.m11709s(r10, r1)
            goto La
        L2b:
            android.os.Parcelable$Creator<x9.f0> r2 = p411x9.C6985f0.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            x9.f0 r1 = (p411x9.C6985f0) r1
            r7 = r1
            goto La
        L35:
            android.os.Parcelable$Creator<v9.j0> r2 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            v9.j0 r1 = (p375v9.C6605j0) r1
            r6 = r1
            goto La
        L3f:
            java.lang.String r1 = p270p6.C5368b.m11695e(r10, r1)
            r5 = r1
            goto La
        L45:
            android.os.Parcelable$Creator<x9.g> r2 = p411x9.C6986g.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            x9.g r1 = (p411x9.C6986g) r1
            r4 = r1
            goto La
        L4f:
            android.os.Parcelable$Creator<v9.w> r2 = p375v9.C6625w.CREATOR
            java.util.ArrayList r1 = p270p6.C5368b.m11698h(r10, r1, r2)
            r3 = r1
            goto La
        L57:
            p270p6.C5368b.m11699i(r10, r0)
            x9.e r10 = new x9.e
            r2 = r10
            r2.<init>(r3, r4, r5, r6, r7)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6982e[] newArray(int r1) {
            r0 = this;
            x9.e[] r1 = new p411x9.C6982e[r1]
            return r1
    }
}
