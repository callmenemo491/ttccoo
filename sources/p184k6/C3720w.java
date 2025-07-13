package p184k6;

/* renamed from: k6.w */
/* loaded from: classes.dex */
public final class C3720w implements android.os.Parcelable.Creator<p184k6.C3717t> {
    public C3720w() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p184k6.C3717t createFromParcel(android.os.Parcel r10) {
            r9 = this;
            int r0 = p270p6.C5368b.m11710t(r10)
            r1 = 0
            r2 = 0
            r4 = r1
            r7 = r4
            r5 = 0
            r6 = 0
            r8 = 0
        Lb:
            int r1 = r10.dataPosition()
            if (r1 >= r0) goto L45
            int r1 = r10.readInt()
            r2 = 65535(0xffff, float:9.1834E-41)
            r2 = r2 & r1
            r3 = 1
            if (r2 == r3) goto L40
            r3 = 2
            if (r2 == r3) goto L3b
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
            android.os.IBinder r7 = p270p6.C5368b.m11704n(r10, r1)
            goto Lb
        L36:
            boolean r6 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L3b:
            boolean r5 = p270p6.C5368b.m11700j(r10, r1)
            goto Lb
        L40:
            java.lang.String r4 = p270p6.C5368b.m11695e(r10, r1)
            goto Lb
        L45:
            p270p6.C5368b.m11699i(r10, r0)
            k6.t r10 = new k6.t
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p184k6.C3717t[] newArray(int r1) {
            r0 = this;
            k6.t[] r1 = new p184k6.C3717t[r1]
            return r1
    }
}
