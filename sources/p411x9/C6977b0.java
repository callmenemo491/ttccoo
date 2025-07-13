package p411x9;

/* renamed from: x9.b0 */
/* loaded from: classes.dex */
public final class C6977b0 implements android.os.Parcelable.Creator<p411x9.C6975a0> {
    public C6977b0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p411x9.C6975a0 createFromParcel(android.os.Parcel r8) {
            r7 = this;
            int r0 = p270p6.C5368b.m11710t(r8)
            r1 = 0
            r2 = r1
            r3 = r2
        L7:
            int r4 = r8.dataPosition()
            if (r4 >= r0) goto L3d
            int r4 = r8.readInt()
            r5 = 65535(0xffff, float:9.1834E-41)
            r5 = r5 & r4
            r6 = 1
            if (r5 == r6) goto L34
            r6 = 2
            if (r5 == r6) goto L2b
            r6 = 3
            if (r5 == r6) goto L22
            p270p6.C5368b.m11709s(r8, r4)
            goto L7
        L22:
            android.os.Parcelable$Creator<v9.j0> r3 = p375v9.C6605j0.CREATOR
            android.os.Parcelable r3 = p270p6.C5368b.m11694d(r8, r4, r3)
            v9.j0 r3 = (p375v9.C6605j0) r3
            goto L7
        L2b:
            android.os.Parcelable$Creator<x9.y> r2 = p411x9.C7006y.CREATOR
            android.os.Parcelable r2 = p270p6.C5368b.m11694d(r8, r4, r2)
            x9.y r2 = (p411x9.C7006y) r2
            goto L7
        L34:
            android.os.Parcelable$Creator<x9.f0> r1 = p411x9.C6985f0.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r8, r4, r1)
            x9.f0 r1 = (p411x9.C6985f0) r1
            goto L7
        L3d:
            p270p6.C5368b.m11699i(r8, r0)
            x9.a0 r8 = new x9.a0
            r8.<init>(r1, r2, r3)
            return r8
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ p411x9.C6975a0[] newArray(int r1) {
            r0 = this;
            x9.a0[] r1 = new p411x9.C6975a0[r1]
            return r1
    }
}
