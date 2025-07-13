package p248o6;

/* renamed from: o6.f0 */
/* loaded from: classes.dex */
public final class C4907f0 implements android.os.Parcelable.Creator<p248o6.C4903d0> {
    public C4907f0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p248o6.C4903d0 createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r2 = 0
            r5 = r1
            r6 = r5
            r4 = 0
            r7 = 0
            r8 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L4a
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L45
            r3 = 2
            if (r2 == r3) goto L40
            r3 = 3
            if (r2 == r3) goto L36
            r3 = 4
            if (r2 == r3) goto L31
            r3 = 5
            if (r2 == r3) goto L2c
            p270p6.C5368b.m11709s(r10, r1)
            goto Lb
        L2c:
            boolean r8 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L31:
            boolean r7 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L36:
            android.os.Parcelable$Creator<k6.b> r2 = p184k6.C3698b.CREATOR
            android.os.Parcelable r1 = p270p6.C5368b.m11694d(r10, r1, r2)
            r6 = r1
            k6.b r6 = (p184k6.C3698b) r6
            goto Lb
        L40:
            android.os.IBinder r5 = p270p6.C5368b.m11704n(r10, r1)
            goto Lb
        L45:
            int r4 = p270p6.C5368b.m11705o(r10, r1)
            goto Lb
        L4a:
            p270p6.C5368b.m11699i(r10, r0)
            o6.d0 r10 = new o6.d0
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p248o6.C4903d0[] newArray(int r1) {
            r0 = this;
            o6.d0[] r1 = new p248o6.C4903d0[r1]
            return r1
    }
}
