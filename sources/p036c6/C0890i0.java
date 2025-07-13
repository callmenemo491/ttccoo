package p036c6;

/* renamed from: c6.i0 */
/* loaded from: classes.dex */
public final class C0890i0 implements android.os.Parcelable.Creator<p036c6.C0887h> {
    public C0890i0() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final p036c6.C0887h createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r0 = p270p6.C5368b.m11710t(r9)
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
            r2 = 0
        L9:
            int r5 = r9.dataPosition()
            if (r5 >= r0) goto L3f
            int r5 = r9.readInt()
            r6 = 65535(0xffff, float:9.1834E-41)
            r6 = r6 & r5
            r7 = 2
            if (r6 == r7) goto L3a
            r7 = 3
            if (r6 == r7) goto L35
            r7 = 4
            if (r6 == r7) goto L30
            r7 = 5
            if (r6 == r7) goto L27
            p270p6.C5368b.m11709s(r9, r5)
            goto L9
        L27:
            android.os.Parcelable$Creator<c6.g> r4 = p036c6.C0885g.CREATOR
            android.os.Parcelable r4 = p270p6.C5368b.m11694d(r9, r5, r4)
            c6.g r4 = (p036c6.C0885g) r4
            goto L9
        L30:
            boolean r2 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L35:
            java.lang.String r3 = p270p6.C5368b.m11695e(r9, r5)
            goto L9
        L3a:
            boolean r1 = p270p6.C5368b.m11700j(r9, r5)
            goto L9
        L3f:
            p270p6.C5368b.m11699i(r9, r0)
            c6.h r9 = new c6.h
            r9.<init>(r1, r3, r2, r4)
            return r9
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ p036c6.C0887h[] newArray(int r1) {
            r0 = this;
            c6.h[] r1 = new p036c6.C0887h[r1]
            return r1
    }
}
